public class PQueue {

    private int timeToIncrementLevel;
    private int maxLevel;
    private boolean queFull;

    public PQueue(){
    }

    public void enPQueue(Process p) {
        queFull = true;
    }

    public boolean isEmpty() {
        return queFull;//set to true if process passed in
    }

    public Process dePQueue() {
        queFull = false;
        return null;//I set this value
    }

    public void update(int timeToIncrementLevel, int maxLevel) {
        this.timeToIncrementLevel = timeToIncrementLevel;
        this.maxLevel = maxLevel;
    }
}
