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
        for(int i = 0;i < n;i++) a[i] = sc.nextInt();
        long sum = 0;
        for(int i = 0;i < k;i++) sum += a[i];
        long ans = sum;
        int idx = 0;
        for(int i = k; i < n;i++){
            sum = sum + a[i] - a[i - k];
            if(ans < sum){
                idx = i;
                ans = sum;
            }
        }
        System.out.println(ans);
        for(int i = idx - k + 1 ; i <= idx;i++){
            System.out.print(a[i] + " ");
        }
    }
}
