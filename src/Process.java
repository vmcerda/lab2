public class Process {
    private String remainingTime;
    private String priority;
    private boolean done;
    private int arrivalTime;

    public String getTimeRemaining() {
        return remainingTime;
    }

    public String getPriority() {
        return priority;
    }

    public void reduceTimeRemaining() {
    }

    public boolean finish() {
        return done;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void resetTimeNotProcessed() {
    }
}
