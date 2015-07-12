package jp.yama07.the5problems;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Write a function that computes the list of the first 100 Fibonacci numbers.
 * By definition, the first two numbers in the Fibonacci sequence are 0 and 1,
 * and each subsequent number is the sum of the previous two. As an example,
 * here are the first 10 Fibonnaci numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, and 34.
 *
 * @author yama07
 */
public class Problem3 {

    public static List<BigDecimal> Fibonacci100() {
        List<BigDecimal> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            if (i == 0) {
                list.add(new BigDecimal(0));
            } else if (i == 1) {
                list.add(new BigDecimal(2));
            } else {
                list.add(list.get(i - 2).add(list.get(i - 1)));
            }
        }
        return list;
    }
}
