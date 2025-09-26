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
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        long sum = 0,sum2 = 0;
        Arrays.sort(a);
        for(int i = 0;i < n;i++){
            if(i % 2 == 0){
                sum = sum * 10 + a[i];
            }
            else sum2 = sum2 * 10 + a[i];
        }
        System.out.print(sum + sum2);
    }
}
