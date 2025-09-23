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
        if(a[0] == 50 || a[0] == 100){
            System.out.print("NO");
            return;
        }
        else{
            int dem50 = 0,dem25 = 0;
            for(int i =0;i < n;i++){
                if(a[i] == 25){
                    dem25++;
                }
                else if(a[i] == 50){
                    if(dem25 >= 1){
                        dem25--;
                        dem50++;
                    }
                    else{
                        System.out.print("NO");
                        return;
                    }
                }
                else if(a[i] == 100){
                    if(dem25 >= 1 && dem50 >= 1){
                        dem25--;dem50--;
                    }
                    else if(dem25>=3){
                        dem25 -= 3;
                    }
                    else {
                        System.out.print("NO");
                        return;
                    }
                }
            }
        }
        System.out.print("YES");
    }
}
