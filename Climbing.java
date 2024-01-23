
// Climbing stairs (Recursion) :-
import java.util.*;

public class Climbing {

    public static int Countways(int n) { // O(n)
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        return Countways(n - 1) + Countways(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(Countways(n));
    }
}

/*
 * Output:-
 * Any step goto : 8
 */
