package assignment1;

public class IntegerNumber {
	private int num;

    IntegerNumber(int num) {
        this.num = num;
    }

    int square() {
        return num * num;
    }

    int cube() {
        return num * num * num;
    }

	public static void main(String[] args) {
		 if (args.length == 0) {
	            System.out.println("Please enter a number as command line argument.");
	            return;
	        }

	        int n = Integer.parseInt(args[0]);
	        IntegerNumber obj = new IntegerNumber(n);

	        System.out.println("Number = " + n);
	        System.out.println("Square = " + obj.square());
	        System.out.println("Cube = " + obj.cube());

	}

}
