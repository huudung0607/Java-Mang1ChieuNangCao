import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

public class Main {
    private static int mod = 1000000007;
    public static boolean prime(int n){
        if(n < 2) return false;
        for(int i = 2;i <= Math.sqrt(n);i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //int n = sc.nextInt();
        //int []a = new int[n];
        LinkedHashMap<Integer,Integer> mp = new LinkedHashMap<>();
        while(sc.hasNext()){
            int x = sc.nextInt();
            if(prime(x)){
                mp.put(x,mp.getOrDefault(x,0) + 1);
            }
        }
        for(Map.Entry<Integer,Integer> i : mp.entrySet()){
            System.out.println(i.getKey() + " " + i.getValue());
        }
    }
}
