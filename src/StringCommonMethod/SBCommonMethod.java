package StringCommonMethod;

/**
 * @author : WangRich
 * @Description : StringBuild与StringBuffer常用方法总结
 * @date : 2022/7/17 21:59
 */
public class SBCommonMethod {
    public static void main(String[] args) {
//        创建StringBuilder对象
        StringBuilder sb = new StringBuilder("hello");

//        append添加
        System.out.println(sb.append(" java"));//hello java

//        delete(x,y)删除下标x到y位置上的字符
        System.out.println(sb.delete(0,1));//ello java

//        deleteCharAt删除指定下标的字符
        System.out.println(sb.deleteCharAt(0));//llo java

//        insert(x,s)在小标x位置插入s
        System.out.println(sb.insert(sb.length()," !"));//llo java !

//        replace(x,y,str)将下标x到y替换为str
        System.out.println(sb.replace(4,8,"c++"));//llo c++ !

//        setCharAt替换指定位置下的字符
        sb.setCharAt(0, 'b');//blo c++ !
        System.out.println(sb);

//        charAt查看指定下标下的字符
        System.out.println(sb.charAt(0));//b

//        substring(x,y)截取下标x到y下的字符串
        System.out.println(sb.substring(0,3));//blo

        /**
         * substring和subSequence的返回类型不一样，substring返回的是String，subSequence返回的是实现了CharSequence接口的类，
         * 使用subSequence得到的结果，只能使用CharSequence接口中的方法。
         * 在String类中已经重写了subSequence，调用subSequence方法，可以直接下转为String对象。
         */

//        subSequence(x,y)截取下标x到y下的字符串
        System.out.println(sb.subSequence(1,3));//lo
    }
}
