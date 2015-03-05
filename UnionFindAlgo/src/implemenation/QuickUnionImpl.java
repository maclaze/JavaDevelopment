package implemenation;

import common.UnionFindBase;
import interfaces.UnionFindInterface;

/**
 * Created by nars on 2/25/15.
 */
public class QuickUnionImpl extends UnionFindBase implements UnionFindInterface {
    @Override
    public void initializeInput() {
        this.initInputArraySize();
        for (int i = 0; i < this.getInputSize(); i++){
            this.setElementAt(i, i);
        }
    }

    @Override
    public boolean find(int p, int q) {
        return false;
    }

    @Override
    public void union(int p, int q) {

    }

    @Override
    public int getRootOf(int nodeP) {
        int parentNode = this.getElementAt(nodeP);
        if (parentNode == nodeP) return nodeP;
        else return getRootOf(parentNode);
    }

    @Override
    public void setRootOf(int nodeP, int newRoot) {

    }

    @Override
    public void process(String inputFilePath) {
        this.setFileParser(inputFilePath);
        this.setInputSize(this.readInputSize());
        this.initializeInput();
        while (this.hasOperationsLeft()){
            String split[] = this.readOperation();
            if (split[0].equals("F"))
            {
                this.find(Integer.parseInt(split[1]),
                        Integer.parseInt(split[2]));
            }
            else
            {
                this.union(Integer.parseInt(split[1]),
                        Integer.parseInt(split[2]));
            }
        }

    }
}
