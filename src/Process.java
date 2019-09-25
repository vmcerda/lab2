public class Process implements Comparable<Process>{

    private int remainingTime;
    private int arrivalTime;
    private int priority;
    private int timeNotProcessed;
    private int newLevel;

    public Process(int remainingTime,int arrivalTime,int priority){
        this.remainingTime = remainingTime;
        this.arrivalTime = arrivalTime;
        this.priority = priority;
    }

    public int getTimeRemaining(){
        return remainingTime;
    }

    public int getArrivalTime(){
        return arrivalTime;
    }

    public int getPriority(){
        return priority;
    }
    public void setPriority(int priority){
        this.priority = priority;
    }
    public void setTimeNotProcessed(int timeNotProcessed){
        this.timeNotProcessed = timeNotProcessed;
    }

    public void reduceTimeRemaining() {
        remainingTime--;
    }

    public void resetTimeNotProcessed() {
        timeNotProcessed = 0;
    }

    public boolean finish(){
        return remainingTime == 0;
    }

    @Override
    public int compareTo(Process process) {
        if(this.getPriority() > process.getPriority()){
            return 1;
        }else if(process.getPriority() > this.getPriority()){
            return -1;
        }else{
            if(this.getArrivalTime() < process.getArrivalTime()){
                return 1;
            }else{
                return -1;
            }
        }
    }
}
