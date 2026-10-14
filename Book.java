package assignment1;
import java.util.Scanner;
public class Book {
	 int bookId;
	    String bookName;
	    double price;

	    void accept(Scanner sc) {
	        System.out.print("Enter book id: ");
	        bookId = sc.nextInt();
	        sc.nextLine();
	        System.out.print("Enter book name: ");
	        bookName = sc.nextLine();
	        System.out.print("Enter price: ");
	        price = sc.nextDouble();
	    }

	    void display() {
	        System.out.println(bookId + "\t" + bookName + "\t" + price);
	    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Book[] books = new Book[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details of book " + (i + 1) + ":");
            books[i] = new Book();
            books[i].accept(sc);
        }

        System.out.println("\nBook Details:");
        System.out.println("ID\tName\tPrice");
        for (int i = 0; i < 5; i++) {
            books[i].display();
        }
    }

	}


