import java.util.ArrayList;
import java.util.List;

public class Queue {
    private List<String> queueList = new ArrayList<>();
    private List<Integer> priorityList = new ArrayList<>();

    public void push(String element, int priority) {
        queueList.add(element);
        priorityList.add(priority);
    }

    public String pop() {
        String element = "";
        int bigElementNum = 0;
        int elementNum = 0;
        for (int i = 0; i < queueList.size(); i++) {
            elementNum = priorityList.get(i);
            for (int j = 1; j < queueList.size(); j++) {
                if (isExchangeElementNumber(elementNum, priorityList.get(j))) {
                    bigElementNum = j;
                    elementNum = priorityList.get(i);
                }
            }
        }
        element = queueList.get(bigElementNum);
        queueList.remove(bigElementNum);
        return element;
    }

    private boolean isExchangeElementNumber(int originalNum, int nextNum) {
        return originalNum < nextNum;
    }

}
