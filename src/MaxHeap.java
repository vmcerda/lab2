import java.util.ArrayList;

public class MaxHeap {

    private final ArrayList<Process> myHeap;

    public MaxHeap(){
        myHeap = new ArrayList<Process>();
    }

    public void insert(Process p) {
        myHeap.add(p);
        maxHeapUp();
    }

    private void maxHeapDWN(int index) {
        int l = leftChild(index);
        int r = rightChild(index);
        int largest = index;

        if(l < myHeap.size() && myHeap.get(l).compareTo(myHeap.get(index)) > 0){
            largest = l;
        }
        if (r < myHeap.size() && myHeap.get(r).compareTo(myHeap.get(index)) < 0) {
            largest = r;
        }
        if (largest != index) {
            Process hold = myHeap.get(index);
            myHeap.add(index, myHeap.get(largest));
            myHeap.add(largest, hold);
            maxHeapDWN(largest);
        }
    }

    private void maxHeapUp(){
        for (int i = myHeap.size()/2; i >= 0; i--){
            maxHeapDWN(i);
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
        return ((index +1)/2);

    }

    public Process extractMax() {
        int highPHold = myHeap.get(0).getPriority();
        int highAHold = myHeap.get(0).getArrivalTime();
        int index = 0;
        for(int i = 1;i < myHeap.size();i++){
            if(myHeap.get(i).getPriority() > highPHold){
                index = i;
                highPHold = myHeap.get(i).getPriority();
            }else if(highPHold == myHeap.get(i).getPriority()){
                if(highAHold > myHeap.get(i).getArrivalTime()){
                    index = i;
                    highPHold = myHeap.get(i).getPriority();
                    highAHold = myHeap.get(i).getArrivalTime();
                }
            }
        }
        return myHeap.remove(index);
    }

    public void update(int timeToIncrementLevel, int maxLevel) {

    }
}
