import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

public class Main {
    public static boolean soTang(int n){
        int last = n % 10;
        n /= 10;
        while (n != 0) {
            int next = n % 10;
            if (next > last) return false;
            last = next;
            n /= 10;
        }
        return true;
    }
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i = 0;i < n;i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        int minDis = Integer.MAX_VALUE;
        for(int i = 1;i < n;i++){
            minDis = Math.min(minDis, a[i] - a[i - 1]);
        }
        int dem = 0;
        for(int i = 1;i < n;i++){
            if(Math.abs(a[i] - a[i - 1]) == minDis){
                dem++;
            }
        }
        System.out.print(minDis + " " + dem);
    }
}
