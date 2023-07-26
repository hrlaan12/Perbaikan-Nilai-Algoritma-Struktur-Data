import java.util.*;

public class DataStruktur {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int q = scanner.nextInt(); 
        while (q > 0) { 
            int q1 = scanner.nextInt();
            if (q1 == 1) {
                int num = scanner.nextInt();
                heap.add(num);
            } else if (q1 == 2) {
                int num = scanner.nextInt();
                heap.remove(num);
            } else if (q1 == 3) {
                System.out.println(heap.peek());
            }
            q--; 
        }
        scanner.close(); 
    }
}

