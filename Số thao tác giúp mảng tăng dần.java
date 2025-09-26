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
        int []a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        long sum = 0;
        for(int i = 1;i < n;i++){
            if(a[i - 1] >= a[i]){
                int res = a[i - 1] - a[i] + 1;
                sum += res;
                a[i] += res;
            }
        }
        System.out.print(sum);
    }
}
