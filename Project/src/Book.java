
public class Book {

	private int ISBN;
	private String author;
	private String title;
	private String genre;
	private String refCode;
	
	public Book() {
		ISBN=0;
		author=null;
		title=null;
		genre=null;
		refCode=null;
	}
	
	public Book(int ISBN,String author,String title,String genre) {
		
		this.ISBN=ISBN;
		this.author=author;
		this.title=title;
		this.genre=genre;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getRefCode() {
		return refCode;
	}
	
	public String Reference() {
		String temp;
		temp=""+this.author.charAt(0);
		temp+=this.author.charAt(1);
		temp+="-";
		temp+=this.genre.charAt(0);
		temp+=this.genre.charAt(1);
		this.refCode=temp;
		return this.refCode;
	}
	
	public void generateReference() {
		Reference();
		
	}
	
	/*public boolean verifyISBN(int iSBN2) {
		
		int left=iSBN2;
		int n1=left/1000;
		left=left%1000;
		int n2=left/100;
		left=left%100;
		int n3=left/10;
		left=left%10;
		int n4=left;
		
		int fourmela=(n1*3+n2*2+n3*1)%4;
		
		if(fourmela==n4) {
			
			this.ISBN=iSBN2;
			
			return true;
		}else
			return false;
	}*/
	
	public boolean verifyISBN(int ISBN) {
		int n1, n2, n3, n4,verify ;

		int temp=ISBN;
		n1 = ISBN / 1000;
		ISBN = ISBN % 1000;

		n2 = ISBN / 100;
		ISBN = ISBN % 100;

		n3 = ISBN / 10;
		ISBN = ISBN % 10;

		n4 = ISBN % 10;

		verify = (n1 * 3 + n2 * 2 + n3 * 1) % 4;

		if (verify == n4) {
			this.ISBN=temp;
			return true;
		}
			
		else
			return false;
	}
	
	public void printBookInfo() {
		
		System.out.println("Title: "+this.title);
		System.out.println("Author: "+this.author);
		System.out.println("ISBN: "+this.ISBN+" - Reference Code : "+Reference().toUpperCase());
		System.out.println("Genre: "+this.genre);
	}
	
	public boolean equals(Book b) {
		
		if(this.ISBN==b.ISBN) {
		
		return true;
		}
		return false;
	}

	
	

	
}
