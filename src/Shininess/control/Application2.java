package Shininess.control;

import java.lang.reflect.Method;

/**
 * @author : WangRich
 * @Description : �������ѡ����
 * @date : 2022/7/19 15:51
 */
public class Application2 {
    public static void main(String[] args) throws Exception{
//        ģ��ǰ�˴�������֧����ʽ������ֵʱ���ȫ�޶�·��
        String payMethod="Shininess.entity.AliPay";
//        �������������֧����ʽClass��
        Class<?> aClass = Class.forName(payMethod);
//        ��ȡ����������������
        Object o = aClass.getDeclaredConstructor().newInstance();
//        ��ȡo�����payOnline����
        Method payOnline = aClass.getMethod("payOnline");
//        o����payOnline����
        payOnline.invoke(o);
    }
}
