package CustomException;

/**
 * @author : WangRich
 * @Description : �Զ����쳣
 * @date : 2022/7/16 21:01
 */
public class MyException extends Exception {
    /**
     * �Զ����쳣��Ҫ�̳��쳣�������Exception,RuntimeException��
     * msgΪ��ʾ�쳣����Ϣ
     */
    public String msg;

    public MyException(String msg) {
        this.msg = msg;
    }

    /**
     * @return toString����ʱ�����쳣ʱ����ʾ��Ϣ
     */
    @Override
    public String toString() {
        return "MyException{" + "msg='" + msg + '\'' + '}';
    }
}
