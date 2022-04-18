public class PriorityQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.push("1番目", 10);
        queue.push("2番目", 10);
        queue.push("3番目", 100);
        queue.push("4番目", 50);

        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
    }
}
