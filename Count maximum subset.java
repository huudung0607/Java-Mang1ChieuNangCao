import com.sun.source.tree.Tree;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), k = sc.nextInt();
        int []a = new int[n];
        for (int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int l = 0,ans = -1;
        for(int r = 0; r < n; r++){
            while(a[l] - a[r] > k){
                l++;
            }
            ans = Math.max(ans, r - l + 1);
        }
        System.out.print(ans);
    }
}
