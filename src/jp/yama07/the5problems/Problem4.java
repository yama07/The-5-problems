package jp.yama07.the5problems;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a function that given a list of non negative integers, arranges them
 * such that they form the largest possible number. For example, given [50, 2,
 * 1, 9], the largest formed number is 95021.
 *
 * @author yama07
 */
public class Problem4 {

    private static final String endMark = "x";

    public static long largestNumber(List<Integer> list) {
        // リストを辞書順に逆ソートしてその後文字列として結合することで目的の値を得る。
        // 終端マークを一時的に付与することで正しい値を得る。
        //
        // ・終端マークがない場合
        //   [1,9,91] -> ["1","9","91"] -> ["91","9","1"] -> "9191" -> 9191
        // ・終端マークがある場合
        //   [1,9,91] -> ["1","9","91"] -> ["1x","9x","91x"] -> ["9x","91x","1x"] -> ["9","91","1"] -> "9911" -> 9911
        String s = list.stream()
                .map(v -> String.valueOf(v).concat(endMark))
                .sorted((o1, o2) -> o2.compareTo(o1))
                .map(v -> String.valueOf(v).replace(endMark, ""))
                .collect(Collectors.joining());
        return Long.parseLong(s);
    }
}
