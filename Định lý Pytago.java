import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

public class Main {
    public static boolean soTang(int n) {
        int last = n % 10;
        n /= 10;
        while (n != 0) {
            int next = n % 10;
            if (next > last) return false;
            last = next;
            n /= 10;
        }
        return true;
    }

    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        List<Long> a = new ArrayList<>(n);
        for (int i = 0 ; i < n ; i++) {
            long x = sc.nextInt();
            x = x * x;
            a.add(x);
        }
        Collections.sort(a);
        for (int i = n - 1 ; i >= 1 ; i--) {
            int l = 0, r = i - 1;
            long sum = a.get(i);
            while (l < r) {
                if (a.get(l) + a.get(r) == sum) {
                    System.out.print("YES");
                    return;
                } else if (a.get(l) + a.get(r) < sum) {
                    l++;
                } else r--;
            }
        }
        System.out.print("NO");
    }
}
