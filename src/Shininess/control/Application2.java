package Shininess.control;

import java.lang.reflect.Method;

/**
 * @author : WangRich
 * @Description : 反射机制选择购物
 * @date : 2022/7/19 15:51
 */
public class Application2 {
    public static void main(String[] args) throws Exception{
//        模拟前端传过来的支付方式，传入值时类的全限定路径
        String payMethod="Shininess.entity.AliPay";
//        创建传入过来的支付方式Class类
        Class<?> aClass = Class.forName(payMethod);
//        获取构造器并创建对象
        Object o = aClass.getDeclaredConstructor().newInstance();
//        获取o对象的payOnline方法
        Method payOnline = aClass.getMethod("payOnline");
//        o调用payOnline方法
        payOnline.invoke(o);
    }
}
