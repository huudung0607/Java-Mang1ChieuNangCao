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
        int ans = -1;
        for(int i = 0;i < n;i++){
            int x = a[i] + k;
            int y = a[i] - k;
            if(mp.containsKey(x)){
                ans = Math.max(ans, i - mp.get(x));
            }
            if(mp.containsKey(y)){
                ans = Math.max(ans, i - mp.get(y));
            }
            if(!mp.containsKey(a[i])){
                mp.put(a[i],i);
            }
        }
        System.out.print(ans);
    }
}
