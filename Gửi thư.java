import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int minDis = 0, maxDis = 0;
        for(int i = 0; i < n; i++){
            if(i == 0){
                minDis = Math.abs(a[i] - a[i + 1]);
                maxDis = Math.abs(a[i] - a[n - i - 1]);
                System.out.println(minDis + " " + maxDis);
            }
            else if(i == n - 1){
                minDis = Math.abs(a[i] - a[i - 1]);
                maxDis = Math.abs(a[i] - a[0]);
                System.out.println(minDis + " " + maxDis);
            }
            else{
                minDis = Math.min(Math.abs(a[i] - a[i - 1]),Math.abs(a[i] - a[i + 1]));
                maxDis = Math.max(Math.abs(a[i] - a[0]),Math.abs(a[i] - a[n - 1]));
                System.out.println(minDis + " " + maxDis);
            }
        }
    }
}
