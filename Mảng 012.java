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
        int []a = new int[n];
        int cnt0 = 0, cnt1 = 0,cnt2 = 0;
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
            if(a[i] == 0) cnt0++;
            else if(a[i] == 1) cnt1++;
            else if(a[i] == 2) cnt2++;
        }
        for(int i = 0;i < cnt0;i++) System.out.print(0 + " ");
        for(int i = 0; i < cnt1;i++) System.out.print(1 + " ");
        for(int i = 0;i < cnt2; i++) System.out.print(2 +" ");

    }
}
