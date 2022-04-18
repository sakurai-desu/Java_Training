import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomQueue {
    private List<String> randList = new ArrayList<>();

    Random random = new Random();

    public void push(String element) {
        randList.add(element);
    }

    public String pop() {
        Random random = new Random();
        String element = "";
        int arrayPointer = 0;
        int randomUpper = 3;

        arrayPointer = decisionRandomPoint(random, randomUpper);
        element = returnRandList(arrayPointer);
        removeDecisionList(arrayPointer);
        randomUpper--;
        return element;
    }

    private String removeDecisionList(int arrayPointer) {
        return randList.remove(arrayPointer);
    }

    private String returnRandList(int pointer) {
        return randList.get(pointer);
    }

    private int decisionRandomPoint(Random rand, int upper) {
        return rand.nextInt(upper);
    }
}
