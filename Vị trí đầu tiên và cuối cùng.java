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
        int k = sc.nextInt();
        int []a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        int idxL = -1, idxR = -1;
        for(int i = 0; i < n;i++){
            if(a[i] == k) {
                idxL = i;
                break;
            }
        }
        for(int i = n - 1;i >= 0;i--){
            if(a[i] == k){
                idxR = i;
                break;
            }
        }
        if(idxR != -1 && idxL != -1) System.out.print((idxL + 1) + " " + (idxR + 1));
        else System.out.print(-1 + " " + -1);
    }
}
