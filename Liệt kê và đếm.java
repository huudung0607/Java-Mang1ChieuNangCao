import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

public class Main {
    public static boolean soTang(int n){
        int last = n % 10;
        n /= 10;
        while (n != 0) {
            int next = n % 10;
            if (next > last) return false;
            last = next;
            n /= 10;
        }
        return true;
    }
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Map<Integer,Integer> mp = new HashMap<>();
        while(sc.hasNext()){
            int x = sc.nextInt();
            if(soTang(x)){
                mp.put(x,mp.getOrDefault(x,0)+ 1);
            }
        }
        var List = new ArrayList<>(mp.entrySet());
        Collections.sort(List, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if(o1.getValue() == o2.getValue()){
                    return o1.getKey().compareTo(o2.getKey());
                }
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for(var i : List){
            System.out.println(i.getKey() + " " + i.getValue());
        }
    }
}
