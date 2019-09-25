import java.util.ArrayList;

public class PQueue {

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
        return maxHeap.extractMax();
    }

    public void update(int timeToIncrementLevel, int maxLevel) {
        maxHeap.update(timeToIncrementLevel,maxLevel);
    }
}
