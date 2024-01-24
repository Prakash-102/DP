
//Wildcard mathching-hard(Explanation):-
import java.util.*;

public class Catalans {

    public static int calalanRec(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int ans = 0; // cn
        for (int i = 0; i <= n - 1; i++) {
            ans += calalanRec(i) * calalanRec(n - i - 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(calalanRec(n));
    }
}

/*
 * Output:-
 * 14
 */
