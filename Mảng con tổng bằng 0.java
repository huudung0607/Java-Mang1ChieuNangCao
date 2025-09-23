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
        int []a = new int[n];
        for(int i = 0;i < n ;i++) a[i] = sc.nextInt();
        Map<Long,Integer> mp = new HashMap<>();
        mp.put(1l * 0,1);
        long sum = 0;
        int ans = 0;
        for(int i = 0 ;i < n ;i++){
            sum += a[i];
            if(mp.containsKey(sum)){
                System.out.print(1);
                return;
            }
            else mp.put(sum,i);
        }
        System.out.print(0);
    }
}
