import java.util.*;
public class Main {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        boolean b1 = set.add(66);                                   // true
        boolean b2 = set.add(10);                                   // true
        boolean b3 = set.add(66);                                   // false
        boolean b4 = set.add(8);                                    // true
        for (Integer integer: set) System.out.print(integer + ","); // 66,8,10,

        Set<Integer> set1 = new TreeSet<>();
        boolean b5 = set1.add(66);                                    // true
        boolean b6 = set1.add(10);                                    // true
        boolean b7 = set1.add(66);                                    // false
        boolean b8 = set1.add(8);                                     // true
        for (Integer integer: set1) System.out.print(integer + ",");  // 8,10,66


    }
}
