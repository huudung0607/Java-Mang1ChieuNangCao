import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    public static int gcd(int a ,int b){
        if(b == 0){
            return a;
        }
        return gcd(b,a % b);
    }
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        Integer[]a = new Integer[n];
        Integer[]b = new Integer[m];
        for(int i = 0;i < n;i++) a[i] = sc.nextInt();
        for(int i = 0;i < m;i++) b[i] = sc.nextInt();
        Integer[]c = new Integer[n + m];
        int idx = 0;
        int i= 0, j = 0;
        while(i < n && j < m){
            if(a[i] <= b[j]){
                c[idx++] = a[i++];
            }
            else c[idx++] = b[j++];
        }
        while(i < n) c[idx++] = a[i++];
        while(j < m) c[idx++] = b[j++];
        for(int tmp : c) System.out.print(tmp + " ");
    }
}
