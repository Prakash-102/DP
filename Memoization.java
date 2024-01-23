
// Memoization - O(n) | recursion (2^n) -> n = 10^5 :-
import java.util.*;

public class Memoization {

    public static int Countways(int n, int ways[]) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (ways[n] != -1) { // already calculated
            return ways[n];
        }
        ways[n] = Countways(n - 1, ways) + Countways(n - 2, ways);
        return ways[n];
    }

    public static void main(String[] args) {
        int n = 5; // n=3 -> 3 & n=4 -> 5 => 8
        int ways[] = new int[n + 1];
        Arrays.fill(ways, -1);
        System.out.println(Countways(n, ways));
    }
}

/*
 * Output:-
 * Any step goto : 8
 */
