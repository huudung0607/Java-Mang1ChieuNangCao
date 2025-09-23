import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        Set<Integer> se = new LinkedHashSet<>();
        int maxVal = Integer.MIN_VALUE;
        for(int i = 0;i < n;i++){
            maxVal = Math.max(maxVal,a[i]);
            se.add(maxVal);
        }
        for(int i : se) System.out.print(i + " ");
    }
}
