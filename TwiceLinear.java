import java.util.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class DoubleLinear {
    public static int dblLinear(int n) {
        if (n == 0) return 1;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Set<Integer> seen = new HashSet<>();
        pq.add(1);
        for (int i = 0; i < n; i++) {
            int x = pq.poll();
            if (seen.add(2 * x + 1)) pq.add(2 * x + 1);
            if (seen.add(3 * x + 1)) pq.add(3 * x + 1);
        }
        return pq.peek();
    }
}

// Example of usage

public class DoubleLinearTest {

    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }
 
    @Test
    public void test() {
        System.out.println("Fixed Tests dblLinear");
        testing(DoubleLinear.dblLinear(10), 22);
        testing(DoubleLinear.dblLinear(20), 57);
        testing(DoubleLinear.dblLinear(30), 91);
        testing(DoubleLinear.dblLinear(50), 175);
             
    }
}
