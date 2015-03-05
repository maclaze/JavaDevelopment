package implemenation;

import common.UnionFindBase;
import interfaces.UnionFindInterface;

/**
 * Created by nars on 2/24/15.
 */
public class QuickFindImpl extends UnionFindBase implements UnionFindInterface{
    public QuickFindImpl() {
        super();
    }

    @Override
    public void initializeInput() {
        this.initInputArraySize();
        for (int i = 0; i < this.getInputSize(); i++){
            this.setElementAt(i,i);
        }
    }

    @Override
    public boolean find(int p, int q) {
        return this.getRootOf(p) == this.getRootOf(q);
    }

    @Override
    public void union(int nodeP, int nodeQ) {
        if (find(nodeP,nodeQ)) return;

        int rootP = this.getRootOf(nodeP);
        for (int node = 0; node < this.getInputSize(); node++)
        {
            if (this.getRootOf(node) == rootP)
            {
                this.setRootOf(node, this.getRootOf(nodeQ));
            }
        }
    }

    @Override
    public int getRootOf(int node) {
        return this.getElementAt(node);
    }

    @Override
    public void setRootOf(int nodeP, int newRoot) {
        this.setElementAt(nodeP, newRoot);
    }

    @Override
    public void process(String inputFilePath) {

    }
}
