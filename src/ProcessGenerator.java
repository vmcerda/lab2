public class ProcessGenerator {

    private Process newProcess;

    public ProcessGenerator(double probability) {
    }

    public boolean query() {
       return true; 
    }

    public Process getNewProcess(int currentTime, int maxProcessTime, int maxLevel) {
        return newProcess;
    }
}
