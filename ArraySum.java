package assignment1;
import java.util.Arrays;
import java.util.Scanner;
public class ArraySum {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];

	        System.out.println("Enter " + n + " elements:");
	        int sum = 0;
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	            sum += arr[i];
	        }

	        System.out.println("Sum of elements = " + sum);

	        Arrays.sort(arr);
	        System.out.println("Array in ascending order:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }
	
	}


