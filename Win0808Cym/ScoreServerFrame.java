import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.*;

public class ScoreServerFrame extends JFrame {
	private ScoreManager scoreManager = null;    //스코어 매니저는 아무도 건들수없게 프라이빗
	private JTextArea log = new JTextArea();     // 로그도 건들면 안되니까 프라비시 
	public ScoreServerFrame() {		//	만들어야될건 스코어서버가 표시될 프레임 
		super("점수 조회 서버");		//생성자는 프레임에 들어가니까 표시한것
		setSize(250, 250);			//사이즈 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 종료 버튼(X)을 클릭하면 프로그램 종료
		Container c = getContentPane();	// 컨텐츠팬 떼어주고
		c.add(new JLabel("점수 조회 서버입니다")); // 서버라고 붙여주고
		c.add(new JScrollPane(log), BorderLayout.CENTER); //가운데는 로그가 보여짐  대충 눈에 그려지죠?
		setVisible(true);         
		
		//scoreManager = new ScoreManager("c:\\temp\\score.txt");  //모름
		scoreManager = new ScoreManager("score.txt");			//스코어매니저를 따로 클래스를 만들어서 거기다가 파일을 읽는걸 하신듯
		if(scoreManager.isFileRead()) { // 단어 파일이 읽혀졌을 경우 서비스 시작    (여기 써있네. is파일리더가 트루 상태면 된거임)
			log.setText("score.txt 읽기 완료\n");   
			new ServerThread().start(); // 서비스 시작
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
					log.append("클라이언트 연결됨\n");
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
		private HashMap<String, String> map = new HashMap<String, String>();    //맵에는 점수와 목록이 들어있음
		private boolean fileOn = false;						//파일온이 뭔지 모름
		
		public ScoreManager(String fileName) {                      	         // 파일네임을 받는 메소드임 , 
			try {
				Scanner reader = new Scanner(new FileReader(fileName));   // 스캐너 파일리더 파일네임을 읽어줌 (아까 스코어 txt를 썼지) 파일리더를 이렇게 만드네
				while(reader.hasNext()) {				//다음다음 읽는동안 						
					String name = reader.next();			//네임 불러들이고
					String score = reader.next();			//스코어 불러들이고
					map.put(name, score);				//맵에 네임이랑 스코어 저장
				}
				reader.close();						//할일 끝났으니 종료
				fileOn = true;         					//파일온이 트루 뭐지
			} catch (FileNotFoundException e) {				//이건 트라이 캐치하면 자동으로 나옴
				e.printStackTrace();					//자동으로 나옴
				fileOn = false;						//모름
			}
		}
		
		public boolean isFileRead() {						//isfileRead하면 파일온을 리턴함(트루나 펄스 값)
			return fileOn;
		}
		
		public String get(String name) {   // map에서 name의 score를 검색하여 리턴
			return map.get(name);
		}
	}
	
	class ServiceThread extends Thread {           //서비스 스레드는 뭐하는 녀석 
		private Socket socket = null;		//비밀접속인가 비밀소켓
		private BufferedReader in = null;       //비밀스럽게 버퍼드리더
		private BufferedWriter out = null;	//비밀스럽게 버퍼드 롸잇
		
		public ServiceThread(Socket socket) { // 클라이언트와 통신할 소켓을 전달받음
			this.socket = socket;           
			try {
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));   //여러줄 쓸거를 한번에 쓰신거같은데??
				out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));//변수 2개~3개정도 압축하신듯
				
			} catch (IOException e) {
				e.printStackTrace();  // 이건 자동으로 나오는거고
			}
		}
		
		@Override
		public void run() {
			while(true) {
				try {
					String name = in.readLine(); // 클라이언트로부터 이름 받음   //스레드 오버라이드죠
					String score = scoreManager.get(name);   //스코어매니저에서 이름을 겟 함 . 
					if(score == null) {                        //스코어가 널이면 없는애
						out.write("없는 이름\n");
						log.append(name + " 없음\n");
					}
					else { 
						out.write(score + "\n");                  //그게 아니면 롸이트 어펜드 둘다 해줌 
						log.append(name + ":" + score + "\n");				
					}
					out.flush();                                  //깜박여주고
				} catch (IOException e) {
					log.append("연결 종료\n");                        //로그에 연결종료라고 
					System.out.println("연결 종료");		//ServiceThread는 한번하면 종료되나봄 
					try {
						socket.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					return; // 스레드 종료
					//e.printStackTrace();
				}

			}
		}
	}
	public static void main(String[] args) {               //메인에서 생성해주는것 
		new ScoreServerFrame();
	}

}
