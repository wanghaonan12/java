package VariableArray;

import java.util.Arrays;

/**
 * @author : WangRich
 * @Description : 可变参数排序demo
 * @date : 2022/7/15 21:15
 */
public class Variable {
    /**
     * JDK 1.5开始，Java支持传递同类型的可变参数给一个方法。
     * 在方法声明中，在指定参数类型后加个省略号(...)。
     * 一个方法中只能指定一个可变参数，它必须是方法的最后一个参数。任何普通的参数必须在它之前声明。
     */
    public static void main(String[] args) {
        System.out.println(maxNumber(2,3,4,5,6));
        System.out.println(maxNumber());
    }




    /**
     *
     * @param numbers 传入数组
     * @return 最大数
     */
    public static double maxNumber(double... numbers) {
        double max = -1;
        if (numbers.length == 0) {
            System.out.println("你传入的数组为空");
            return -1;
        } else {
            for (double number : numbers) {
                if (max<number) {
                    max = number;
                }
            }
        }
         return max;
    }
}
