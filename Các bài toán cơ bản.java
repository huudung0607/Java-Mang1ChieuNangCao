import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static boolean prime(int n) {
        if (n < 2) return false;
        int limit = (int)Math.sqrt(n);
        for (int i = 2; i <= limit; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int maxval = Integer.MIN_VALUE;
        int minval = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            maxval = Math.max(maxval, a[i]);
            minval = Math.min(minval, a[i]);
        }
        int indexmax = -1, indexmin = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == maxval) {
                indexmax = i;
                break;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] == minval) {
                indexmin = i;
                break;
            }
        }
        System.out.println(maxval + " " + indexmax);
        System.out.println(minval + " " + indexmin);
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (prime(a[i])) {
                cnt++;
            }
        }
        System.out.println(cnt);
        int l = 0, r = n - 1;
        boolean dx = true;
        while (l <= r) {
            if (a[l] != a[r]) {
                dx = false;
            }
            l++;
            r--;
        }
        Arrays.sort(a);
        int max_val2 = a[n - 2];
        int min_val2 = a[1];
        System.out.println(Math.max(maxval * max_val2, minval * min_val2));
        if (dx) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        long ans = 1;
        for (int i = 0; i < n; i++) {
            ans = (ans * (a[i] % mod)) % mod;
        }
        System.out.println(ans);
    }
}
