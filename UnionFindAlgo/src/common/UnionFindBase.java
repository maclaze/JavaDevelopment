package common;

import java.util.InputMismatchException;

/**
 * Created by nars on 2/24/15.
 */
public class UnionFindBase {
    private ReadConsoleInput readConsoleInput = null;
    private InputFileParser fileParser = null;
    private int[] inputArray = null;

    public void setFileParser(String filePath) {
        this.fileParser = new InputFileParser(filePath);
    }

    private int inputSize = 0;

    public UnionFindBase() {
        this.readConsoleInput = ReadConsoleInput.getInstance();
    }
    public int getInputSize() {
        return inputSize;
    }

    private void checkArrayBounds(int index) {
        assert index < this.getInputSize() && index >=0;
    }

    public void setInputSize(int inputSize) {
        this.inputSize = inputSize;
    }
    public int getElementAt(int index)
    {
        checkArrayBounds(index);
        return this.inputArray[index];
    }

    public int readInputSize()
    {
        assert this.fileParser != null;
        return Integer.parseInt(this.fileParser.readNextLine());
    }
    public String[] readOperation()
    {
        assert this.fileParser != null;
        return (this.fileParser.readNextLine()).split(" ");
    }
    public Boolean hasOperationsLeft(){
        return this.fileParser.hasNext();
    }
    public void setElementAt(int index, int value)
    {
        checkArrayBounds(index);
        this.inputArray[index] = value;
    }



    public void getInputArraySize()
    {
        try {
            this.inputSize = this.readConsoleInput.readInput("Input array size");
        } catch ( InputMismatchException e) {
            System.out.println("Error: Invalid Integer \\n assuming 0");
        }
    }
    public void initInputArraySize()
    {
        this.inputArray = new int[this.inputSize];
    }
}