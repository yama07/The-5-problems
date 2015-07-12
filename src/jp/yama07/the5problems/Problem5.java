package jp.yama07.the5problems;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntBinaryOperator;

/**
 * Write a program that outputs all possibilities to put + or - or nothing
 * between the numbers 1, 2, ..., 9 (in this order) such that the result is
 * always 100. For example: 1 + 2 + 34 – 5 + 67 – 8 + 9 = 100.
 *
 * @author yama07
 */
public class Problem5 {

    private enum Operator {

        ADD((x, y) -> x + y), SUB((x, y) -> x - y);
        private final IntBinaryOperator op;

        private Operator(IntBinaryOperator op) {
            this.op = op;
        }

        public int operate(int value1, int value2) {
            return op.applyAsInt(value1, value2);
        }
    };

    public static List<String> getNumericalFormula100() {
        List<String> formula = new ArrayList<>();
        _setFormulaList(1, "1", formula, 0, 1, Operator.ADD);
        return formula;
    }

    /**
     * このメソッドを再帰的に呼び出して、答えが100となる数式をformulaListに追加していく。
     * buf1 op[+|-] buf2 の計算をbufの値を移しながら計算していく。
     * 
     * @param num 1~9の値。
     * @param s 数式
     * @param formulaList 数式をセット(add)するリスト
     * @param buf1 数式のバッファ
     * @param buf2 数式のバッファ
     * @param op 演算子
     */
    private static void _setFormulaList(int num, String s, List<String> formulaList, int buf1, int buf2, Operator op) {
        if (8 < num) {
            int value = op.operate(buf1, buf2);
            String formula = s + " = " + value;
            if (value == 100) {
                formulaList.add(formula);
            }
            return;
        }
        _setFormulaList(num + 1, s + "" + (num + 1), formulaList, buf1, buf2 * 10 + (num + 1), op);
        _setFormulaList(num + 1, s + " + " + (num + 1), formulaList, op.operate(buf1, buf2), (num + 1), Operator.ADD);
        _setFormulaList(num + 1, s + " - " + (num + 1), formulaList, op.operate(buf1, buf2), (num + 1), Operator.SUB);
    }

}
