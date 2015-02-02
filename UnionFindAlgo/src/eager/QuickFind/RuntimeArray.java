package eager.QuickFind;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RuntimeArray {

	private static int[] inputArray;
	private static Scanner scan;

	public static int readInput(){
		scan = new Scanner(System.in);
		System.out.println("\n enter a value");
		int readIntVal = scan.nextInt();
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
		for (int i = 0; i < inputAr.length; i++) {
			inputAr[i] = i;
		}
		return inputAr;
	}

	public static void main(String[] args) {
		inputArray = initializeInput();
		boolean isConnected = false;
		do {
			int p = readInput();
			int q = readInput();
			isConnected = find(p,q);
			System.out.println(isConnected);
			if (!isConnected) {
				union(p, q);
			}
		}while(!isConnected);
			scan.close();
		for (int i = 0; i < inputArray.length; i++) {
			System.out.println(inputArray[i]);
		}
	}

	public static boolean find(int p, int q)
	{
		return inputArray[p] == inputArray[q];
	}

	public static void union(int p, int q)
	{
		int pid = inputArray[p];
		for (int i = 0; i < inputArray.length; i++) {
			if(inputArray[i] == pid)
				inputArray[i] = inputArray[q];
		}
	}

}