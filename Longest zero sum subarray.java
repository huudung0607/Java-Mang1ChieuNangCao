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
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        Map<Integer,Integer>mp = new HashMap<>();
        mp.put(0,-1);
        int ans = -1, sum = 0;
        int idx = -1;
        for(int i = 0;i < n;i++){
            sum += a[i];
            if(mp.containsKey(sum)){
                if(i - mp.get(sum) > ans){
                    ans = i - mp.get(sum);
                    idx = i;
                }
            }
            else mp.put(sum,i);
        }
        for(int i = idx - ans + 1; i <= idx;i++){
            System.out.print(a[i] + " ");
        }
    }
}
