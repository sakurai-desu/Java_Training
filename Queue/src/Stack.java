import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<String> stackList = new ArrayList<>();

    public void push(String element) {
        stackList.add(element);
    }

    public String pop() {
        String element = "";
        element = stackList.get(stackList.size() - 1);
        stackList.remove(stackList.size() - 1);
        return element;
    }
}
