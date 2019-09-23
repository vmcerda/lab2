public class Process {

    private int remainingTime;
    private int arrivalTime;
    private int priority;
    private Object timeNotProcessed;

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

    public void reduceTimeRemaining() {
        remainingTime--;
    }

    public void resetTimeNotProcessed() {
        timeNotProcessed = 0;
    }

    public boolean finish(){
        return remainingTime == 0;
    }
    public boolean compareTo(Process one, Process two){
        if (one.getPriority() > two.getPriority()){
            return true;
        }else if(two.getPriority() > one.getPriority()){
            return false;
        }else{
            if(one.getArrivalTime() < two.getArrivalTime()){
                return true;
            }else{
                return false;
            }
        }
    }
}
