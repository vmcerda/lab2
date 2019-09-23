import java.util.ArrayList;

public class MaxHeap {

    private final ArrayList<Process> myHeap;

    public MaxHeap(){
        myHeap = new ArrayList<Process>();
    }

    public void insert(Process p) {
        myHeap.add(p);
        //maxHeapUp(myHeap.size() -1);
    }

    private void maxHeapUp(int index) {
//        for(int i = index; i != 0;i = i/2){
//            if(myHeap.get(i).compareTo(myHeap.get(i),myHeap.get(i-1))){
//                Process hold = myHeap.get(i - 1);
//                myHeap.add(i-1,myHeap.get(i));
//                myHeap.add(i,hold);
//            }
//        }
    }


    public boolean isEmpty() {
        return myHeap.isEmpty();
    }
    private int myHeapSize(){
        return myHeap.size();
    }
}
