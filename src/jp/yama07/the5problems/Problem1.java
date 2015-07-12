package jp.yama07.the5problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Write three functions that compute the sum of the numbers in a given list
 * using a for-loop, a while-loop, and recursion.
 *
 * @author yama07
 */
public class Problem1 {

    public static int sum_for(List<Integer> list) {
        int sum = 0;
        for (int n : list) {
            sum += n;
        }
        return sum;
    }

    public static int sum_while(List<Integer> list) {
        int sum = 0;
        List<Integer> _list = new ArrayList<>(list);
        while (!_list.isEmpty()) {
            sum += _list.remove(0);
        }
        return sum;
    }

    public static int sum_recursive(List<Integer> list) {
        return _sum_recursive(list, 0);
    }

    private static int _sum_recursive(List<Integer> list, int index) {
        if (list.size() <= index) {
            return 0;
        } else {
            return list.get(index) + _sum_recursive(list, index + 1);
        }
    }

}
