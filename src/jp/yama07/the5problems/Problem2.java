package jp.yama07.the5problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a function that combines two lists by alternatingly taking elements.
 * For example: given the two lists [a, b, c] and [1, 2, 3], the function should
 * return [a, 1, b, 2, c, 3].
 *
 * @author yamam07
 */
public class Problem2 {

    public static List<Object> concatList(List list1, List list2) {
        List<Object> list = new ArrayList<>();
        int maxSize = Math.max(list1.size(), list2.size());
        for (int i = 0; i < maxSize; i++) {
            if (i < list1.size()) {
                list.add(list1.get(i));
            }
            if (i < list2.size()) {
                list.add(list2.get(i));
            }
        }
        return list;
    }
}
