package CustomException;

/**
 * @author : WangRich
 * @Description : 自定义异常
 * @date : 2022/7/16 21:01
 */
public class MyException extends Exception {
    /**
     * 自定义异常需要继承异常类可以是Exception,RuntimeException等
     * msg为显示异常的信息
     */
    public String msg;

    public MyException(String msg) {
        this.msg = msg;
    }

    /**
     * @return toString方法时返回异常时的提示信息
     */
    @Override
    public String toString() {
        return "MyException{" + "msg='" + msg + '\'' + '}';
    }
}
