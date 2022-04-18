public class RandomQueueManagement {
    public static void main(String[] args) {
        RandomQueue randomQueue = new RandomQueue();

        randomQueue.push("1番目");
        randomQueue.push("2番目");
        randomQueue.push("3番目");

        System.out.println(randomQueue.pop());
        System.out.println(randomQueue.pop());
        System.out.println(randomQueue.pop());
    }
}
