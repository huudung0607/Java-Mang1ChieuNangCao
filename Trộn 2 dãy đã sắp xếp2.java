import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        Integer[] b = new Integer[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0 ; i < n ; i++) {
            b[i] = sc.nextInt();
        }
        int idxA = 0, idxB = 0;
        Arrays.sort(a);
        Arrays.sort(b,Collections.reverseOrder());
        int []c = new int[n + n];
        for(int i = 0;i < 2 * n;i++){
            if(i % 2 == 0){
                c[i] = a[idxA++];
            }
            else c[i] = b[idxB++];
        }
        for(var x : c) System.out.print(x + " ");
    }
}
