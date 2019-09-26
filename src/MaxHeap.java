import java.util.ArrayList;

public class MaxHeap {

    private final ArrayList<Process> myHeap;

    public MaxHeap(){
        myHeap = new ArrayList<>();
    }

    public void insert(Process p) {
        myHeap.add(p);
        maxHeapUp(myHeap.size()-1);
    }

    private void maxHeapDWN(int index) {
        int l = leftChild(index);
        int r = rightChild(index);
        int largest = index;

        if(l < myHeap.size() && myHeap.get(l).compareTo(myHeap.get(largest)) > 0){
            largest = l;
        }
        if (r < myHeap.size() && myHeap.get(r).compareTo(myHeap.get(largest)) > 0) {
            largest = r;
        }
        if (largest != index) {
            Process hold = myHeap.get(index);
            myHeap.set(index, myHeap.get(largest));
            myHeap.set(largest, hold);
            maxHeapDWN(largest);
        }
    }

    private void maxHeapUp(int index){
        Process child = myHeap.get(index);
        int parentIndex = parent(index);
        Process parent = myHeap.get(parentIndex);

        while(index != 0 && child.compareTo(parent) > 0 ){
            myHeap.set(parentIndex, child);
            myHeap.set(index, parent);
            index = parentIndex;
            parentIndex = parent(index);
            parent = myHeap.get(parentIndex);
        }
    }

    public boolean isEmpty() {
        return myHeap.isEmpty();
    }

    private int leftChild(int index){
        return ((2*index) + 1);
    }

    private int rightChild(int index){
        return ((2*index) + 2);
    }

    private int parent(int index){
        if(index == 0){
            return 0;
        }
        return ((index -1)/2);

    }

    public Process extractMax() {
        if (myHeap.size() < 1) {
            System.out.println("Heap underflow");
            System.exit(0);
        } else if (myHeap.size() == 1) {
            return myHeap.remove(0);
        }
        Process max = myHeap.get(0);
        myHeap.set(0,myHeap.get(myHeap.size()-1));
        myHeap.remove(myHeap.size()-1);
        maxHeapDWN(0);
        return max;
    }

    public void update(int timeToIncrementLevel, int maxLevel) {
        for(int i = 0; i < myHeap.size();i++){
            Process process = myHeap.get(i);
            process.increaseTimeNotProcessed();
            if(process.getTimeNotProcessed() >= timeToIncrementLevel){
                process.resetTimeNotProcessed();
                if(process.getPriority() < maxLevel){
                    process.setPriority(process.getPriority() + 1);
                    maxHeapUp(i);
                }
            }
        }
    }
}
