package interfaces;

/**
 * Created by nars on 2/11/15.
 */
public interface UnionFindInterface {
    public void initializeInput();
    public  boolean find(int p, int q);
    public  void union(int p, int q);
    public int getRootOf(int nodeP);
    public void setRootOf(int nodeP, int newRoot);
    public void process(String inputFilePath);
}
