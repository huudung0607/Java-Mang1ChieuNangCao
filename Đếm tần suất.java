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
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        TreeMap<Integer,Integer> mp = new TreeMap<>();
        for(int i = 0;i < n;i++) {
            a[i] = sc.nextInt();
            mp.put(a[i],mp.getOrDefault(a[i],0)+1);
            map.put(a[i],map.getOrDefault(a[i],0) + 1);
        }
        for(Map.Entry<Integer,Integer> i : mp.entrySet()){
            System.out.println(i.getKey() + " " + i.getValue());
        }
        System.out.println();
        for(Map.Entry<Integer,Integer> i : map.entrySet()){
            System.out.println(i.getKey() + " " + i.getValue());
        }
    }
}
