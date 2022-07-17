package StringCommonMethod;

/**
 * @author : WangRich
 * @Description : StringBuild��StringBuffer���÷����ܽ�
 * @date : 2022/7/17 21:59
 */
public class SBCommonMethod {
    public static void main(String[] args) {
//        ����StringBuilder����
        StringBuilder sb = new StringBuilder("hello");

//        append���
        System.out.println(sb.append(" java"));//hello java

//        delete(x,y)ɾ���±�x��yλ���ϵ��ַ�
        System.out.println(sb.delete(0,1));//ello java

//        deleteCharAtɾ��ָ���±���ַ�
        System.out.println(sb.deleteCharAt(0));//llo java

//        insert(x,s)��С��xλ�ò���s
        System.out.println(sb.insert(sb.length()," !"));//llo java !

//        replace(x,y,str)���±�x��y�滻Ϊstr
        System.out.println(sb.replace(4,8,"c++"));//llo c++ !

//        setCharAt�滻ָ��λ���µ��ַ�
        sb.setCharAt(0, 'b');//blo c++ !
        System.out.println(sb);

//        charAt�鿴ָ���±��µ��ַ�
        System.out.println(sb.charAt(0));//b

//        substring(x,y)��ȡ�±�x��y�µ��ַ���
        System.out.println(sb.substring(0,3));//blo

        /**
         * substring��subSequence�ķ������Ͳ�һ����substring���ص���String��subSequence���ص���ʵ����CharSequence�ӿڵ��࣬
         * ʹ��subSequence�õ��Ľ����ֻ��ʹ��CharSequence�ӿ��еķ�����
         * ��String�����Ѿ���д��subSequence������subSequence����������ֱ����תΪString����
         */

//        subSequence(x,y)��ȡ�±�x��y�µ��ַ���
        System.out.println(sb.subSequence(1,3));//lo
    }
}
