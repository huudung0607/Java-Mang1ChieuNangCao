import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        Set<Integer> se = new HashSet<>();
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        int index = 0;
        int curL = 1;
        int maxL = 1;
        long curSum = a[0], maxsum = a[0];
        for (int i = 1 ; i < n ; i++) {
            if (a[i] != a[i - 1]) {
                curL += 1;
                curSum = curSum + a[i];
            } else {
                curL = 1;
                curSum = a[i];
            }
            if (curL > maxL) {
                index = i;
                maxL = curL;
                maxsum = curSum;
            } else if (curL == maxL) {
                if (curSum > maxsum) {
                    maxsum = curSum;
                    index = i;
                }
            }
        }
        System.out.println(maxL);
        for (int i = index - maxL + 1 ; i <= index ; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
