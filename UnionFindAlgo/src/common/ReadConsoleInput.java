package common;

import java.util.Scanner;

public class ReadConsoleInput {
    private static ReadConsoleInput readConsoleInputInstance = null;
    private Scanner scan;
    protected ReadConsoleInput()
    {

    }
    public static ReadConsoleInput getInstance() {
        if (readConsoleInputInstance == null)
        {
            readConsoleInputInstance = new ReadConsoleInput();
            readConsoleInputInstance.scan = new Scanner(System.in);
        }
        return readConsoleInputInstance;
    }

    public final int readInput(String msg) {
        System.out.println(msg + "\n enter a value");
        int readIntVal = this.scan.nextInt();
        return readIntVal;
    }

    protected void finalize() {
        this.scan.close();
        System.out.print("called finalize");
    }
}