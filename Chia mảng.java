import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        k = Math.min(k,n - k);
        long sum1 = 0,sum2 = 0;
        for(int i = 0; i < k;i++){
            sum1 += a[i];
        }
        for(int i = k;i < n;i++){
            sum2 += a[i];
        }
        System.out.print(sum2 - sum1);
    }
}
