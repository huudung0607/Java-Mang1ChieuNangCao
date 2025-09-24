import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

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
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> a = new TreeSet<>();
        Set<Integer> b = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            b.add(sc.nextInt());
        }
        List<Integer> res = a.stream().filter(b::contains).collect(Collectors.toList());
        for (int x : res) {
            System.out.print(x + " ");
        }
        System.out.println();
        Set<Integer> hop = new TreeSet<>(a);
        hop.addAll(b);
        for (int x : hop) {
            System.out.print(x + " ");
        }
    }
}
