package eager.QuickFind;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RuntimeArray {

	private static int[] inputArray;

	public static int readInput(){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter");
		int readIntVal = scan.nextInt();
		scan.close();
		return readIntVal;

	}

	private static int[] initializeInput() {
		int n = 0;
		try {
			n = readInput();
		} catch ( InputMismatchException e) {
			System.out.println("invlaid integer");
		}
		int[] inputAr = new int[n];
		System.out.println(inputArray.length + ": is the array size");
		return inputAr;
	}
	public static void main(String[] args) {
		inputArray = initializeInput();;
	}
}