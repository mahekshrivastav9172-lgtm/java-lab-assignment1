package assignment1;

public class MyDate {
   int dd,mm,yy;
   // Default constructor
   MyDate() {
       this.dd = 1;
       this.mm = 1;
       this.yy = 2000;
   }

   // Parameterized constructor
   MyDate(int dd, int mm, int yy) {
       this.dd = dd;
       this.mm = mm;
       this.yy = yy;
   }

   void display() {
       System.out.println(this.dd + "-" + this.mm + "-" + this.yy);
   }

	public static void main(String[] args) {
		  MyDate d1 = new MyDate();
	        MyDate d2 = new MyDate(13, 10, 2026);

	        System.out.print("Default date: ");
	        d1.display();

	        System.out.print("Parameterized date: ");
	        d2.display();

	}

}
