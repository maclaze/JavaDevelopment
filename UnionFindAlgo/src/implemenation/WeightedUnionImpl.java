package implemenation;

/**
 * Created by nars on 3/10/15.
 */
public class WeightedUnionImpl extends QuickUnionImpl{

    int[] weightArray = null;

    public void initializeInput() {
        this.initInputArraySize();
        weightArray = new int[this.getInputSize()];
        for (int i = 0; i < this.getInputSize(); i++) {
            this.setElementAt(i,i);
            this.setWeightAt(i,1);
        }
    }

    public void setWeightAt(int index, int value)
    {
        this.weightArray[index] = value;
    }
    public int getWeightAt(int index)
    {
        return this.weightArray[index];
    }

    public void union(int p, int q) {
        if (! find(p, q))
        {
            int rootWeightOfP= this.getWeightAt(this.getRootOf(p));
            int rootWeightOfQ= this.getWeightAt(this.getRootOf(q));
            if (rootWeightOfP < rootWeightOfQ)
            {
                this.setRootOf(p, getRootOf(q));
            }
            else
            {
                this.setRootOf(q, getRootOf(p));
            }
        }
    }

    public void setRootOf(int nodeP, int newRoot) {
        int currentWeight = this.getWeightAt(getRootOf(nodeP));
        int newRootWeight = this.getWeightAt(newRoot);
        this.setElementAt(getRootOf(nodeP), newRoot);
        this.setWeightAt(newRoot, currentWeight+newRootWeight);
    }

}
