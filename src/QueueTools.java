import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueTools {

    public static Queue<Integer> createQueue(){
        Scanner sc = new Scanner(System.in);
        Queue<Integer> newQueue = new LinkedList<>();

        System.out.println("Wprowadź 10 liczb całkowitych: ");
        int i = 1;
        do{
            System.out.print(i + ": ");
            newQueue.offer(sc.nextInt());
            i++;
        }while (newQueue.size() < 10);

        return newQueue;
    }

}
