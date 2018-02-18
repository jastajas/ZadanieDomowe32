import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {


        Queue<Integer> numbers = QueueTools.createQueue();


        int sum = 0;

        while (!numbers.isEmpty()) {
            sum += numbers.peek();

            System.out.print(numbers.poll());

            if (!numbers.isEmpty()) {
                System.out.print("+");
            } else {
                System.out.print("=");
            }
        }
        System.out.print(sum);
    }
}
