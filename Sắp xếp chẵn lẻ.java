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
        Integer[]a = new Integer[n];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 % 2 == 0 && o2 % 2 != 0){
                    return 1;
                }
                else if(o1 % 2 != 0 && o2 % 2 == 0){
                    return -1;
                }
                else if(o1 % 2 == 0 && o2 % 2 == 0){
                    return o1.compareTo(o2);
                }
                else return o2.compareTo(o1);
            }
        });
        for(int i : a)System.out.print(i + " ");
    }
}
