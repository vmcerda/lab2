import java.util.Random;

public class ProcessGenerator {

    private final double givenProb;
    private Random rnd = new Random();

    public ProcessGenerator(double probability) {
        givenProb = probability;
    }

    public boolean query() {
        return rnd.nextDouble() <= givenProb;
    }

    public Process getNewProcess(int currentTime, int maxProcessTime, int maxLevel) {
        int priority = rnd.nextInt(maxLevel)+1;
        int remainingTime = rnd.nextInt(maxProcessTime)+1;
        Process newProcess = new Process(remainingTime,currentTime,priority);
        return null;
    }
}
