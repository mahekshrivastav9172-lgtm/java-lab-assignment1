package assignment1;
import java.util.Scanner;
public class Customer {
	
	    int cid;
	    String cname;
	    double billAmount;

	    void accept(Scanner sc) {
	        System.out.print("Enter customer id: ");
	        cid = sc.nextInt();
	        sc.nextLine();
	        System.out.print("Enter customer name: ");
	        cname = sc.nextLine();
	        System.out.print("Enter bill amount: ");
	        billAmount = sc.nextDouble();
	    }
	    void display() {
	        System.out.println(cid + "\t" + cname + "\t" + billAmount);
	    }

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of customers: ");
	        int n = sc.nextInt();
	        Customer[] c = new Customer[n];

	        for (int i = 0; i < n; i++) {
	            System.out.println("Enter details of customer " + (i + 1) + ":");
	            c[i] = new Customer();
	            c[i].accept(sc);
	        }

	        // Sort by bill amount (ascending)
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (c[j].billAmount > c[j + 1].billAmount) {
	                    Customer temp = c[j];
	                    c[j] = c[j + 1];
	                    c[j + 1] = temp;
	                }
	            }
	        }

	        System.out.println("\nCustomers sorted by bill amount (ascending):");
	        System.out.println("ID\tName\tBill Amount");
	        for (int i = 0; i < n; i++) {
	            c[i].display();
	        }
	    }
	}

	


