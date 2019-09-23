import java.util.ArrayList;

public class PQueue {

    private int timeToIncrementLevel;
    private int maxLevel;
    private MaxHeap maxHeap;

    public PQueue(){
        maxHeap = new MaxHeap();
    }

    public void enPQueue(Process p) {
        maxHeap.insert(p);
    }

    public boolean isEmpty() {
        return maxHeap.isEmpty();
    }

    public Process dePQueue() {
        return null;//I set this value
    }

    public void update(int timeToIncrementLevel, int maxLevel) {
        this.timeToIncrementLevel = timeToIncrementLevel;
        this.maxLevel = maxLevel;
    }
}
