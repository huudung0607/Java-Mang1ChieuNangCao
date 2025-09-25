import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

public class Main {

    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), q = sc.nextInt();
        long []a = new long[n];
        for(int i = 0;i < n;i++) a[i] = sc.nextLong();
        long []F = new long[n];
        F[0] = a[0];
        for(int i = 1;i < n;i++){
            F[i] = F[i - 1] + a[i];
        }
        for(int i = 0;i < q;i++){
            int l = sc.nextInt(), r = sc.nextInt();
            l--;
            r--;
            if(l == 0) System.out.println(F[r]);
            else System.out.println(F[r] - F[l - 1]);
        }
    }
}
