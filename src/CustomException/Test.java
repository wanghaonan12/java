package CustomException;

/**
 * @author : WangRich
 * @Description : 异常类测试
 * @date : 2022/7/16 21:11
 */
public class Test {
    public static void main(String[] args) {
        try {
            //调用自定义异常处理方法
            throwException(9);
        } catch (MyException e) {
            System.out.println(e);
        }

    }
    /**
     * 自定义方法根据自己需要的规则写出异常抛出条件，这里的判断条件时当传入的int数据小于10进行异常抛出
     *
     * @param t 根据传入的数字大小判断
     * @throws MyException 抛出自定义的异常
     */
    public static void throwException(int t) throws MyException {
        if (t < 10) {
            //创建并抛出自定义异常类，传入异常显示信息
            throw new MyException("自定义异常抛出");
        }
    }
}
