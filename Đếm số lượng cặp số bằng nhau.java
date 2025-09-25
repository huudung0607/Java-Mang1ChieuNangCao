import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

public class Main {

    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);

    public static long toHop(int n) {
        return 1l * n * (n - 1) / 2;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
            mp.put(a[i], mp.getOrDefault(a[i], 0) + 1);
        }
        long sum = 0;
        for (var i : mp.entrySet()) {
            sum += 1l * toHop(i.getValue());
        }
        System.out.print(sum);
    }
}
