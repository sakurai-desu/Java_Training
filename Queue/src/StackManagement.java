public class StackManagement {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push("1番目");
        stack.push("2番目");
        stack.push("3番目");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
