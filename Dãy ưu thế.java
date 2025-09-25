import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int cnt = 0, cntChan = 0;
        while(sc.hasNext()){
            int x = sc.nextInt();
            cnt++;
            if(x % 2 == 0) cntChan++;
        }
        if(cntChan > (cnt - cntChan) && cnt % 2 == 0){
            System.out.print("YES");
        }
        else if((cnt - cntChan) > cntChan && cnt % 2 != 0){
            System.out.print("YES");
        }
        else System.out.print("NO");
    }
}
