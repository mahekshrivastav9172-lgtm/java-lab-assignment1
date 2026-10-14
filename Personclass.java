package assignment1;
import java.util.Scanner;
public class Personclass {
	
	    int pid;
	    String pname;
	    int age;
	    String gender;

	    // Default constructor
	    Personclass() {
	        this.pid = 0;
	        this.pname = "Unknown";
	        this.age = 0;
	        this.gender = "Unknown";
	    }

	    // Parameterized constructor (overloaded)
	    Personclass(int pid, String pname, int age, String gender) {
	        this.pid = pid;
	        this.pname = pname;
	        this.age = age;
	        this.gender = gender;
	    }

	    void display() {
	        System.out.println(this.pid + "\t" + this.pname + "\t" + this.age + "\t" + this.gender);
	    }

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        Personclass[] p = new Personclass[5];

	        for (int i = 0; i < 5; i++) {
	            System.out.println("Enter details of person " + (i + 1) + ":");
	            System.out.print("Enter id: ");
	            int pid = sc.nextInt();
	            sc.nextLine();
	            System.out.print("Enter name: ");
	            String pname = sc.nextLine();
	            System.out.print("Enter age: ");
	            int age = sc.nextInt();
	            sc.nextLine();
	            System.out.print("Enter gender: ");
	            String gender = sc.nextLine();

	            p[i] = new Personclass(pid, pname, age, gender);
	        }

	        System.out.println("\nPerson Details:");
	        System.out.println("ID\tName\tAge\tGender");
	        for (int i = 0; i < 5; i++) {
	            p[i].display();
	        }
	        // Default constructor demo
	        Personclass d = new Personclass();
	        System.out.println("\nDefault constructor object:");
	        d.display();
	    }
		

	}


