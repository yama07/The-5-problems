package jp.yama07;

import java.util.Arrays;
import java.util.List;
import jp.yama07.the5problems.*;

/**
 *
 * @author yamamoto
 */
public class The5Problems {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 問１
        System.out.println("[Problem1]");
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("  Input list   : " + list1);
        System.out.println("  sum for      : " + Problem1.sum_for(list1));
        System.out.println("  sum while    : " + Problem1.sum_while(list1));
        System.out.println("  sum recursive: " + Problem1.sum_recursive(list1));

        // 問２
        System.out.println("[Problem2]");
        List<String> list2_1 = Arrays.asList("A", "B", "C");
        List<Integer> list2_2 = Arrays.asList(1, 2, 3);
        System.out.println("  Input list1: " + list2_1);
        System.out.println("  Input list2: " + list2_1);
        System.out.println("  concat list: " + Problem2.concatList(list2_1, list2_2));

        // 問３
        System.out.println("[Problem3]");
        System.out.println("  Fibonacci: " + Problem3.Fibonacci100());

        // 問４
        System.out.println("[Problem4]");
        List<Integer> list4 = Arrays.asList(50, 2, 1, 9);
        System.out.println("  Input list         : " + list4);
        System.out.println("  Largest number list: " + Problem4.largestNumber(list4));

        // 問５
        System.out.println("[Problem5]");
        System.out.println("  Formula: " + Problem5.getNumericalFormula100());

    }

}
