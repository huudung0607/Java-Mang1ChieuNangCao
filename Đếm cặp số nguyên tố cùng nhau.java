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
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        int cnt = 0;
        for(int i = 0;i < n;i++){
            for(int j = i + 1;j < n;j++){
                if(gcd(a[i],a[j]) == 1){
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}
