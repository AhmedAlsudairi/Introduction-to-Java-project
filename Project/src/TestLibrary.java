import java.util.Scanner;

public class TestLibrary {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		
		Library b=new Library();
		int option;
		
		do {
			System.out.println("**********************************************************************");
			System.out.println("*                    Welcome to KSU Library :)");
			System.out.println("*                   ---------------------------");
			System.out.println("*      Please enter one of the following options: ");
			System.out.println("*     1) Add a book");
			System.out.println("*     2) Delete a book");
			System.out.println("*     3) Find a book");
			System.out.println("*     4) List all books");
			System.out.println("*     5) List books for a given genre");
			System.out.println("*     6) Number of books for a given author");
			System.out.println("*     7) Total number of books");
			System.out.println("*     8) Exit");
			System.out.println("**********************************************************************");
			
			
			System.out.println("Enter your option :> ");  
			
			option= input.nextInt();
			
			if(option==1) {
				System.out.println("Please, enter the book details #ISBN, author, title, and genre.");
				

				if(b.addBook(input.nextInt(),input.next(),input.next(),input.next())) {
					System.out.println("The book has been added.");
				}else
					System.out.println("The book was'n added.");
			}
			
			if(option==2) {
				System.out.println("Please, enter the book ISBN: ");
				b.deleteBook(input.nextInt());
				System.out.println("The book has been deleted.");
			}
			
			if(option==3) {
				System.out.println("Please, enter the book ISBN: ");
				System.out.println(b.findBook(input.nextInt()));
				
			}
			
			if(option==4) {
				b.printAll();
			}
			
			if(option==5) {
				System.out.println("Please, enter the genre :");
				b.printGenre(input.next());
			}
			
			if(option==6) {
				System.out.println("Please, enter the name of author: ");
				String answer=input.next(); 
				System.out.println("Number of books for a given author are: "+b.getNumberOfBooksByAuthor(answer));
			}
				
			if(option==7) {
				System.out.println("The total number of books is: "+b.getNumOfBooks());
			}
			
		} while (!(option==8));
		
		System.out.println("Thanks. Goodbye!");

	}

}
