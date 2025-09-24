import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static int []money = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};
    public static void main(String[] args) {
        long n = sc.nextLong();
        long cnt = 0;
        for(int i = 0;i < 10;i++){
            cnt += n/money[10 - i - 1];
            n %= money[10 - i - 1];
        }
        System.out.print(cnt);
    }
}
