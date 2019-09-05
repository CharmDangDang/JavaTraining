import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.*;

public class ScoreServerFrame extends JFrame {
	private ScoreManager scoreManager = null;    //���ھ� �Ŵ����� �ƹ��� �ǵ������ �����̺�
	private JTextArea log = new JTextArea();     // �α׵� �ǵ�� �ȵǴϱ� ������ 
	public ScoreServerFrame() {		//	�����ߵɰ� ���ھ���� ǥ�õ� ������ 
		super("���� ��ȸ ����");		//�����ڴ� �����ӿ� ���ϱ� ǥ���Ѱ�
		setSize(250, 250);			//������ ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� ��ư(X)�� Ŭ���ϸ� ���α׷� ����
		Container c = getContentPane();	// �������� �����ְ�
		c.add(new JLabel("���� ��ȸ �����Դϴ�")); // ������� �ٿ��ְ�
		c.add(new JScrollPane(log), BorderLayout.CENTER); //����� �αװ� ������  ���� ���� �׷�����?
		setVisible(true);         
		
		//scoreManager = new ScoreManager("c:\\temp\\score.txt");  //��
		scoreManager = new ScoreManager("score.txt");			//���ھ�Ŵ����� ���� Ŭ������ ���� �ű�ٰ� ������ �д°� �Ͻŵ�
		if(scoreManager.isFileRead()) { // �ܾ� ������ �������� ��� ���� ����    (���� ���ֳ�. is���ϸ����� Ʈ�� ���¸� �Ȱ���)
			log.setText("score.txt �б� �Ϸ�\n");   
			new ServerThread().start(); // ���� ����
		}
	}
	
	class ServerThread extends Thread {
		@Override
		public void run() {
			ServerSocket listener = null;
			Socket socket = null;
			try {
				listener = new ServerSocket(9998);
				while(true) {
					socket = listener.accept();
					log.append("Ŭ���̾�Ʈ �����\n");
					new ServiceThread(socket).start();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				if(listener != null)
					listener.close();
				if(socket != null)
					socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	class ScoreManager {
		private HashMap<String, String> map = new HashMap<String, String>();    //�ʿ��� ������ ����� �������
		private boolean fileOn = false;						//���Ͽ��� ���� ��
		
		public ScoreManager(String fileName) {                      	         // ���ϳ����� �޴� �޼ҵ��� , 
			try {
				Scanner reader = new Scanner(new FileReader(fileName));   // ��ĳ�� ���ϸ��� ���ϳ����� �о��� (�Ʊ� ���ھ� txt�� ����) ���ϸ����� �̷��� �����
				while(reader.hasNext()) {				//�������� �дµ��� 						
					String name = reader.next();			//���� �ҷ����̰�
					String score = reader.next();			//���ھ� �ҷ����̰�
					map.put(name, score);				//�ʿ� �����̶� ���ھ� ����
				}
				reader.close();						//���� �������� ����
				fileOn = true;         					//���Ͽ��� Ʈ�� ����
			} catch (FileNotFoundException e) {				//�̰� Ʈ���� ĳġ�ϸ� �ڵ����� ����
				e.printStackTrace();					//�ڵ����� ����
				fileOn = false;						//��
			}
		}
		
		public boolean isFileRead() {						//isfileRead�ϸ� ���Ͽ��� ������(Ʈ�糪 �޽� ��)
			return fileOn;
		}
		
		public String get(String name) {   // map���� name�� score�� �˻��Ͽ� ����
			return map.get(name);
		}
	}
	
	class ServiceThread extends Thread {           //���� ������� ���ϴ� �༮ 
		private Socket socket = null;		//��������ΰ� ��м���
		private BufferedReader in = null;       //��н����� ���۵帮��
		private BufferedWriter out = null;	//��н����� ���۵� ����
		
		public ServiceThread(Socket socket) { // Ŭ���̾�Ʈ�� ����� ������ ���޹���
			this.socket = socket;           
			try {
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));   //������ ���Ÿ� �ѹ��� ���ŰŰ�����??
				out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));//���� 2��~3������ �����Ͻŵ�
				
			} catch (IOException e) {
				e.printStackTrace();  // �̰� �ڵ����� �����°Ű�
			}
		}
		
		@Override
		public void run() {
			while(true) {
				try {
					String name = in.readLine(); // Ŭ���̾�Ʈ�κ��� �̸� ����   //������ �������̵���
					String score = scoreManager.get(name);   //���ھ�Ŵ������� �̸��� �� �� . 
					if(score == null) {                        //���ھ ���̸� ���¾�
						out.write("���� �̸�\n");
						log.append(name + " ����\n");
					}
					else { 
						out.write(score + "\n");                  //�װ� �ƴϸ� ����Ʈ ����� �Ѵ� ���� 
						log.append(name + ":" + score + "\n");				
					}
					out.flush();                                  //���ڿ��ְ�
				} catch (IOException e) {
					log.append("���� ����\n");                        //�α׿� ���������� 
					System.out.println("���� ����");		//ServiceThread�� �ѹ��ϸ� ����ǳ��� 
					try {
						socket.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					return; // ������ ����
					//e.printStackTrace();
				}

			}
		}
	}
	public static void main(String[] args) {               //���ο��� �������ִ°� 
		new ScoreServerFrame();
	}

}
