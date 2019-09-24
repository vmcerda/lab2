import java.util.ArrayList;

public class MaxHeap {

    private final ArrayList<Process> myHeap;

    public MaxHeap(){
        myHeap = new ArrayList<Process>();
    }

    public void insert(Process p) {
        myHeap.add(p);
        maxHeapUp(myHeap);
    }

    private void maxHeapDWN(ArrayList<Process> heap,int index) {
        int l = leftChild(index);
        int r = rightChild(index);
        int largest = parent(index);
        if(heap.size() > 3) {
            if (l <= heap.size() && heap.get(l).compareTo(heap.get(l), heap.get(index))) { // uses compare method to find which node has priority
                largest = l;
            }
            if (r <= heap.size() && heap.get(r).compareTo(heap.get(r), heap.get(index))) { // uses compare method to find which node has priority
                largest = r;
            }
            if (largest != index) {
                Process hold = myHeap.get(index);
                myHeap.add(index, myHeap.get(largest));
                myHeap.add(largest, hold);
                maxHeapDWN(heap, largest);
            }
        }
    }

    private void maxHeapUp(ArrayList<Process> heap){
        int size = heap.size();
        for (int i = 0; i == size/2; i++){
            maxHeapDWN(heap, i);
        }
    }

    public boolean isEmpty() {
        return myHeap.isEmpty();
    }

    private int leftChild(int index){
        return 2*(index);
    }

    private int rightChild(int index){
        return (2 * index) + 1;
    }

    private int parent(int index){
        return (index/2);

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
}
