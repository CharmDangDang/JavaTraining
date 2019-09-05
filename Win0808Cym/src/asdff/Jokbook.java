package asdff;

import java.io.Serializable;

public class Jokbook implements Serializable{
	
	String booktitle ;
	int pricetag;
	transient String sn;
	String author;
	public Jokbook(String booktitle, int pricetag, String sn, String author) {
		super();
		this.booktitle = booktitle;
		this.pricetag = pricetag;
		this.sn = sn;
		this.author = author;
		
	}
		public String getBooktitle() {
			return booktitle;
		}


		public void setBooktitle(String booktitle) {
			this.booktitle = booktitle;
		}


		public int getPricetag() {
			return pricetag;
		}


		public void setPricetag(int pricetag) {
			this.pricetag = pricetag;
		}


		public String getSn() {
			return sn;
		}


		public void setSn(String sn) {
			this.sn = sn;
		}


		public String getAuthor() {
			return author;
		}


		public void setAuthor(String author) {
			this.author = author;
		}

	
	public static void main(String[] args) {
		

	}

}
