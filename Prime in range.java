import com.sun.source.tree.Tree;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static int[] F = new int[1000001];
    public static int[] prime = new int[1000001];
    public static void seive(){
        for(int i = 0;i < 1000001;i++){
            prime[i] = 1;
        }
        prime[0] = prime[1] = 0;
        for(int i = 2;i < Math.sqrt(1000001);i++){
            if(prime[i] == 1){
                for(int j = i * i; j < 1000001;j += i){
                    prime[j] = 0;
                }
            }
        }
        F[0] = F[1] = 1;
        for(int i = 2;i < 1000001;i++){
            if (prime[i] == 1){
                F[i] = F[i - 1] + 1;
            }
            else F[i] = F[i - 1];
        }
    }
    public static void main(String[] args) {
        int q = sc.nextInt();
        seive();
        for(int i =0;i < q;i++){
            int l = sc.nextInt(), r =sc.nextInt();
            System.out.println(F[r] - F[l - 1]);
        }
    }
}
