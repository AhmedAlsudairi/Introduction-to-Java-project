
public class Library {

	private Book [] libraryBooks;
	private int numOfBooks;
	public static final int MAX_SIZE=100;
	
	
	public Library() {
		numOfBooks=0;
		libraryBooks=new Book[MAX_SIZE];
	}
	
	public boolean addBook(int ISBN,String author,String title,String genre) {
		
		Book o=new Book(ISBN,author,title,genre);
		
		if(numOfBooks<MAX_SIZE) {
			
			if(o.verifyISBN(ISBN)&&findBook(ISBN)==-1) {
				
				libraryBooks[numOfBooks]=new Book( ISBN, author, title, genre);
				numOfBooks++;
				
				return true;
			}else 
				return false;
			
		}else 
			return false;
		
	}
	
	public boolean addBook(Book book) {
		
		if (numOfBooks<MAX_SIZE) {
			
			libraryBooks[numOfBooks]=book;
			numOfBooks++;
			
			return true;
		}else 
			return false;
		
	}
	
	public void deleteBook(int ISBN) {
		
		for(int i=0;i<numOfBooks;i++) {
			
			if(libraryBooks[i].getISBN()==ISBN) {
				
				libraryBooks[i]=null;
				
				libraryBooks[i]=libraryBooks[numOfBooks-1];
				numOfBooks--;
			}
				
		}
	}
	
	public int findBook(int ISBN) {
		int IndBook=-1;
		for(int i=0;i<numOfBooks;i++) {
			
			if(ISBN==libraryBooks[i].getISBN()) {
				IndBook=i;
			}
		}
		return IndBook;
	}
	
	public int findBook(Book book) {
		int IndBook=-1;
		for(int i=0;i<numOfBooks;i++) {
			
			if(book.getISBN()==libraryBooks[i].getISBN()) {
				IndBook=i;
			}
		}
		return IndBook;
		
	}
	
	public void printAll() {
		
		for(int i=0;i<numOfBooks;i++) {
			
			libraryBooks[i].printBookInfo();
		}
	}
	
	public void printGenre(String genre) {
		
		for(int i=0;i<numOfBooks;i++) {
			
			if(libraryBooks[i].getGenre().equals(genre)) {
				
				libraryBooks[i].printBookInfo();
			}
		}
		
	}
	
	public int getNumberOfBooksByAuthor(String author) {
		
		int TotalNumOfBooks=0;
		for(int i=0; i<numOfBooks;i++) {
			
			if(libraryBooks[i].getAuthor().equals(author)) {
				
				TotalNumOfBooks++;
			}
		}
		return TotalNumOfBooks;
	}
	

	public int getNumOfBooks() {
		return numOfBooks;
	}

	public Book[] getLibraryBooks() {
		return libraryBooks;
	}

	public void setNumOfBooks(int numOfBooks) {
		this.numOfBooks = numOfBooks;
	}

	
	
	
}
