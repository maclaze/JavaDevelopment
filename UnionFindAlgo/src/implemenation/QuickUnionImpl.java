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
        return getRootOf(p) == getRootOf(q);
    }

    @Override
    public void union(int p, int q) {
        if (! find(p, q))
        {
            this.setRootOf(p, getRootOf(q));
        }
    }

    @Override
    public int getRootOf(int nodeP) {
        int parentNode = this.getElementAt(nodeP);
        if (parentNode == nodeP) return nodeP;
        else return getRootOf(parentNode);
    }

    @Override
    public void setRootOf(int nodeP, int newRoot) {
        this.setElementAt(getRootOf(nodeP), newRoot);
    }

    @Override
    public void process(String inputFilePath) {
        this.setFileParser(inputFilePath);
        this.setInputSize(this.readInputSize());
        this.initializeInput();
        while (this.hasOperationsLeft()){
                this.doOperation();
        }

    }
    public void doOperation()
    {
        String split[] = this.readOperation();

        assert split.length == 3;
        if (split[0].equals("F"))
        {
            System.out.println("Find between P:" + split[1] + " Q: "
                    + split[2]);
            boolean result = this.find(Integer.parseInt(split[1]),
                    Integer.parseInt(split[2]));
            System.out.println(result);
        }
        else
        {
            System.out.println("Union between P:" + split[1] + " Q: "
                    + split[2]);
            this.union(Integer.parseInt(split[1]),
                    Integer.parseInt(split[2]));
        }
    }
}
