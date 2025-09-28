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
        int sum = 0;
        Map<Integer,Integer> mp = new HashMap<>();
        mp.put(0,-1);
        int ans = Integer.MAX_VALUE;
        for(int i = 0;i < n;i++){
            sum += a[i];
            if(mp.containsKey(sum - k)){
                ans = Math.min(ans,i - mp.get(sum - k));
            }
            else mp.put(sum,i);
        }
        if(ans != Integer.MAX_VALUE) System.out.print(ans);
        else System.out.print(-1);
    }
}
