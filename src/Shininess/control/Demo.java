package Shininess.control;

import Shininess.entity.Person;
import Shininess.entity.Student;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author : WangRich
 * @Description : Class��ĳ��÷���
 * @date : 2022/7/19 21:20
 */
public class Demo {
    public static void main(String[] args) throws Exception {
//        ����Class�����ַ�������
//        1.ͨ��getClass����������ȡ��������
        Class<? extends Person> aClass = new Person().getClass();
        System.out.println(aClass);//class Shininess.entity.Person
        System.out.println();
//        2.ͨ������class���Ի�ȡ��������
        Class<Person> aClass1 = Person.class;
//        3.ͨ��forName()��ȡ���Ƚϳ���
        Class<?> aClass2 = Class.forName("Shininess.entity.Person");
//        4.�������������ȡ��������
        ClassLoader classLoader = Demo.class.getClassLoader();
        Class<?> aClass3 = classLoader.loadClass("Shininess.entity.Person");
//        ͨ�����ַ���������class����һ����
        System.out.println(aClass == aClass1 && aClass1 == aClass2 && aClass2 == aClass3);//true
        System.out.println();


//        �ӿ�
        Class<Comparable> comparableClass = Comparable.class;
        System.out.println(comparableClass);//interface java.lang.Comparable
        System.out.println();
//        ע��
        Class<Override> overrideClass = Override.class;
        System.out.println(overrideClass);//interface java.lang.Override
        System.out.println();
//        ����
        int[] arr = {1, 2, 3, 4};
        int[][] arr2 = {{11, 11}, {22, 22}};
        Class<? extends int[]> aClass4 = arr.getClass();
        Class<? extends int[][]> aClass5 = arr2.getClass();
        System.out.println(aClass4);//class [I
        System.out.println();
        System.out.println(aClass5);//class [[I
        System.out.println();
//        ������������
        String str = "java";
        Class<? extends String> aClass6 = str.getClass();
        System.out.println(aClass6);//class java.lang.String
        System.out.println();


//        ��ȡ�ֽ�����Ϣ�еĹ�����
        Class<?> aClass7 = Class.forName("Shininess.entity.Student");
//        ��ȡ��ǰ�౻public���εĹ�����
        Constructor<?>[] constructor = aClass7.getConstructors();
        for (Constructor<?> c : constructor) {
            System.out.println(c);
        }//public Shininess.entity.Student()
        System.out.println();

//        ��ȡ��ǰ����ʱ��ȫ�����η��Ĺ�����
        Constructor<?>[] declaredConstructor = aClass7.getDeclaredConstructors();
        for (Constructor<?> c : declaredConstructor) {
            System.out.println(c);
//        private Shininess.entity.Student(int)
//        Shininess.entity.Student(int,double)
//        protected Shininess.entity.Student(int,double,double)
//        public Shininess.entity.Student()
        }
        System.out.println();

//        ��ȡָ��public�޲ι�����
        Constructor<?> constructor1 = aClass7.getConstructor();
        System.out.println(constructor1);//public Shininess.entity.Person()
        System.out.println();

//        ��ȡָ��private���ι�����:getDeclaredConstructor(�������͵�class)
        Constructor<?> constructor2 =  aClass7.getDeclaredConstructor(int.class);
        System.out.println(constructor2);//private Shininess.entity.Student(int)
        System.out.println();

//        ʹ�ù�����
        Object o = constructor1.newInstance();
        System.out.println(o);//Student{sno=0, height=0.0, weight=0.0, score=0.0}
        System.out.println();



//        ��ȡ��������


        Class<?> aClass8 = Class.forName("Shininess.entity.Student");
//        getFields��ȡ����ʱ��͸��౻public���ε�����
        Field[] fields = aClass8.getFields();
        for (Field field : fields) {
            System.out.println(field);
//            public double Shininess.entity.Student.score
//            public java.lang.String Shininess.entity.Person.name
        }
        System.out.println();

//        getDeclaredFields����ȡ����ʱ���е���������
        Field[] declaredFields = aClass8.getDeclaredFields();
        for(Field field:declaredFields){
            System.out.println(field);
//            private int Shininess.entity.Student.sno
//            double Shininess.entity.Student.height
//            protected double Shininess.entity.Student.weight
//            public double Shininess.entity.Student.score
        }
        System.out.println();

        //��ȡָ�������ԣ�getField("������")
        Field score = aClass8.getField("score");
        System.out.println(score);
        Field sno = aClass8.getDeclaredField("sno");
        System.out.println(sno);
        System.out.println();

//        ��ȡ�����ṹ�ķ���:
//        .getModifiers()��ȡ���η�������һ�����֣�ÿһ�����η���Ӧ��һ�����ֿ���ʹ��Modifiers��toStringת��
        System.out.println(aClass8.getModifiers());//1
        System.out.println(Modifier.toString(aClass8.getModifiers()));//public

//        getTypeName��ȡ��������
        System.out.println(aClass8.getTypeName());
//        getName��ȡ��������
        System.out.println(aClass8.getName());

//        ���Ը�ֵ
        Object o1 = aClass8.getConstructor().newInstance();
        Field score1 = aClass8.getField("score");
        score1.set(o1,100);
        System.out.println(o1);//Student{sno=0, height=0.0, weight=0.0, score=100.0}



        //��ȡ�ֽ�����Ϣ��
        Class cls = Student.class;
        //��ȡ������
        //getMethods:��ȡ����ʱ��ķ����������и����еķ�������public���Σ�
        Method[] methods = cls.getMethods();
        for(Method m:methods){
            System.out.println(m);
        }
        System.out.println("-----------------------");
        //getDeclaredMethods:��ȡ����ʱ���е����з�����
        Method[] declaredMethods = cls.getDeclaredMethods();
        for(Method m:declaredMethods){
            System.out.println(m);
        }
        System.out.println("-----------------------");
        //��ȡָ���ķ�����
        Method showInfo1 = cls.getMethod("showInfo");
        System.out.println(showInfo1);
        Method showInfo2 = cls.getMethod("showInfo", int.class, int.class);
        System.out.println(showInfo2);
        Method work = cls.getDeclaredMethod("work",int.class);
        System.out.println(work);
        System.out.println("-----------------------");


        //��ȡ�����ľ���ṹ��
        /*
        @ע��
        ���η� ����ֵ����  ������(�����б�) throws XXXXX{}
         */
        //���֣�
        System.out.println(work.getName());
        //���η���
        int modifiers = work.getModifiers();
        System.out.println(Modifier.toString(modifiers));
        //����ֵ��
        System.out.println(work.getReturnType());
        //�����б�
        Class[] parameterTypes = work.getParameterTypes();
        for(Class c:parameterTypes){
            System.out.println(c);
        }
        //��ȡע�⣺
        Method myMethod = cls.getMethod("myMethod");
        Annotation[] annotations = myMethod.getAnnotations();
        for(Annotation a:annotations){
            System.out.println(a);
        }
        //��ȡ�쳣��
        Class[] exceptionTypes = myMethod.getExceptionTypes();
        for(Class c:exceptionTypes){
            System.out.println(c);
        }
        //���÷�����
        Object o3 = cls.newInstance();
        myMethod.invoke(o3);//����o�����mymethod����
        System.out.println(showInfo2.invoke(o3,12,45));
    }
}
