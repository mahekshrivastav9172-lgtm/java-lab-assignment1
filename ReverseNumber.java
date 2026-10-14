package assignment1;

public class ReverseNumber {

	public static void main(String[] args) {
		if (args.length == 0) {
            System.out.println("Please enter a number as command line argument.");
            return;
        }

        int n = Integer.parseInt(args[0]);
        int temp = n, rev = 0;

        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }

        System.out.println("Original number: " + n);
        System.out.println("Reversed number: " + rev);
    }

	}


