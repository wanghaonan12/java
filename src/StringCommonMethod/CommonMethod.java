package StringCommonMethod;

import java.util.Arrays;

/**
 * @author : WangRich
 * @Description : 字符串常用方法
 * @date : 2022/7/17 21:07
 */
public class CommonMethod {
    public static void main(String[] args) {
//定义一个字符串
        String s="hello java";
//        通过构造器创建String对象
        String s1 =new String("hello word") ;
        String s2 = new String(new char[]{'h', 'e', 'l', 'l'});

        System.out.println("字符串长度"+s.length());//字符串长度1
//        isEmpty只有字符串是空值或是null时为true
        System.out.println("isEmpty判断字符串是否为空"+s1.isEmpty());//isEmpty判断字符串是否为空false
//        isBlank对于字符串中的空格换行符等统统作为空值处理
        System.out.println("isBlank判断字符串是否为空"+s1.isBlank());//isEmpty判断字符串是否为空false
        System.out.println("isBlank判断字符串是否为空"+" ".isBlank());//isEmpty判断字符串是否为空true
//        charAt获取字符串指定下标字符
        System.out.println("charAt获取字符串指定下标字符："+s1.charAt(0));//charAt获取字符串指定下标字符：h
//        equals比较字符串
        System.out.println("equals比较字符串："+s.equals(s1));//equals比较字符串：false
        System.out.println("equals比较字符串："+s.equals("hello java"));//equals比较字符串：true
//        compareTo比较字符串时会返回第一个不一样字符的ASCII码的差值,如果短的字符串与长的字符串的前部分重合，则会返回他们的长度差为一个负数，两个字符串相等的时候返回0
        System.out.println("compareTo比较字符串："+s.compareTo(s1));//compareTo比较字符串：-13
        System.out.println("compareTo比较字符串："+"b".compareTo("a"));//compareTo比较字符串：1
        System.out.println("compareTo比较字符串："+"sss".compareTo("sssssssss"));//compareTo比较字符串：-6

        //字符串的截取：
        System.out.println("substring(x)截取字符串下标x之后的所有字符"+s1.substring(3));//substring(x)截取字符串下标x之后的所有字符lo word
        System.out.println("substring(x, y)截取字符串下标x到y之间的字符"+s1.substring(3, 6));//substring(x, y)截取字符串下标x到y之间的字符lo
        //字符串的拼接操作：
        System.out.println("字符串的拼接操作:"+s1.concat("pppp"));//字符串的拼接操作:hello wordpppp
        //字符串中的字符的替换：
        System.out.println("replace('o', 'w')将字符串中的o全部替换为w："+s1.replace('o', 'w'));//replace('o', 'w')将字符串中的o全部替换为w：hellw wwrd
        //split按照指定的字符串进行分裂为数组的形式：
        String s3 = "a-b-c-d-e-f";
        System.out.println(Arrays.toString(s3.split("-")));//[a, b, c, d, e, f]
        //转大小写的方法：
        String s4= "abc";
        System.out.println(s4.toUpperCase());//ABC
        System.out.println(s4.toUpperCase().toLowerCase());//abc
        //去除收尾空格：
        String s5 = "    a  b  c    ";
        System.out.println(s5.trim());//a  b  c
        //toString()
        String s6 = "abc";
        System.out.println(s6.toString());//abc
        //String.valueOf可以将对象类型，布尔类型，字符串数组等转换为String类型：
        System.out.println(String.valueOf(new char[]{'2','3'}));//23
    }
}
