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
        long []a = new long[n];
        TreeMap<Long,Integer> mp = new TreeMap<>();
        for(int i = 0;i < n;i++){
            a[i] = sc.nextLong();
        }
        for(int i = 0; i < k;i++){
            mp.put(a[i],mp.getOrDefault(a[i],0)+1);
        }
        System.out.println(mp.firstKey() + " " + mp.lastKey());
        for(int i = 1; i < n - k + 1;i++){
            long tmp = a[i - 1];
            if(mp.get(tmp) == 1){
                mp.remove(tmp);
            }
            else{
                mp.put(tmp,mp.get(tmp) - 1);
            }
            mp.put(a[i + k - 1],mp.getOrDefault(a[i + k - 1],0) + 1);
            System.out.println(mp.firstKey() + " " + mp.lastKey());
        }
    }
}
