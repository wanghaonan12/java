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
 * @Description : Class类的常用方法
 * @date : 2022/7/19 21:20
 */
public class Demo {
    public static void main(String[] args) throws Exception {
//        创建Class的四种方法方法
//        1.通过getClass（）方法获取，不常用
        Class<? extends Person> aClass = new Person().getClass();
        System.out.println(aClass);//class Shininess.entity.Person
        System.out.println();
//        2.通过内置class属性获取，不常用
        Class<Person> aClass1 = Person.class;
//        3.通过forName()获取，比较常用
        Class<?> aClass2 = Class.forName("Shininess.entity.Person");
//        4.利用类加载器获取，不常用
        ClassLoader classLoader = Demo.class.getClassLoader();
        Class<?> aClass3 = classLoader.loadClass("Shininess.entity.Person");
//        通过四种方法创建的class都是一样的
        System.out.println(aClass == aClass1 && aClass1 == aClass2 && aClass2 == aClass3);//true
        System.out.println();


//        接口
        Class<Comparable> comparableClass = Comparable.class;
        System.out.println(comparableClass);//interface java.lang.Comparable
        System.out.println();
//        注解
        Class<Override> overrideClass = Override.class;
        System.out.println(overrideClass);//interface java.lang.Override
        System.out.println();
//        数组
        int[] arr = {1, 2, 3, 4};
        int[][] arr2 = {{11, 11}, {22, 22}};
        Class<? extends int[]> aClass4 = arr.getClass();
        Class<? extends int[][]> aClass5 = arr2.getClass();
        System.out.println(aClass4);//class [I
        System.out.println();
        System.out.println(aClass5);//class [[I
        System.out.println();
//        基本数据类型
        String str = "java";
        Class<? extends String> aClass6 = str.getClass();
        System.out.println(aClass6);//class java.lang.String
        System.out.println();


//        获取字节码信息中的构造器
        Class<?> aClass7 = Class.forName("Shininess.entity.Student");
//        获取当前类被public修饰的构造器
        Constructor<?>[] constructor = aClass7.getConstructors();
        for (Constructor<?> c : constructor) {
            System.out.println(c);
        }//public Shininess.entity.Student()
        System.out.println();

//        获取当前运行时的全部修饰符的构造器
        Constructor<?>[] declaredConstructor = aClass7.getDeclaredConstructors();
        for (Constructor<?> c : declaredConstructor) {
            System.out.println(c);
//        private Shininess.entity.Student(int)
//        Shininess.entity.Student(int,double)
//        protected Shininess.entity.Student(int,double,double)
//        public Shininess.entity.Student()
        }
        System.out.println();

//        获取指定public无参构造器
        Constructor<?> constructor1 = aClass7.getConstructor();
        System.out.println(constructor1);//public Shininess.entity.Person()
        System.out.println();

//        获取指定private带参构造器:getDeclaredConstructor(参数类型的class)
        Constructor<?> constructor2 =  aClass7.getDeclaredConstructor(int.class);
        System.out.println(constructor2);//private Shininess.entity.Student(int)
        System.out.println();

//        使用构造器
        Object o = constructor1.newInstance();
        System.out.println(o);//Student{sno=0, height=0.0, weight=0.0, score=0.0}
        System.out.println();



//        获取对象属性


        Class<?> aClass8 = Class.forName("Shininess.entity.Student");
//        getFields获取运行时类和父类被public修饰的属性
        Field[] fields = aClass8.getFields();
        for (Field field : fields) {
            System.out.println(field);
//            public double Shininess.entity.Student.score
//            public java.lang.String Shininess.entity.Person.name
        }
        System.out.println();

//        getDeclaredFields：获取运行时类中的所有属性
        Field[] declaredFields = aClass8.getDeclaredFields();
        for(Field field:declaredFields){
            System.out.println(field);
//            private int Shininess.entity.Student.sno
//            double Shininess.entity.Student.height
//            protected double Shininess.entity.Student.weight
//            public double Shininess.entity.Student.score
        }
        System.out.println();

        //获取指定的属性：getField("属性名")
        Field score = aClass8.getField("score");
        System.out.println(score);
        Field sno = aClass8.getDeclaredField("sno");
        System.out.println(sno);
        System.out.println();

//        获取参数结构的方法:
//        .getModifiers()获取修饰符，返回一个数字，每一个修饰符对应了一个数字可以使用Modifiers。toString转换
        System.out.println(aClass8.getModifiers());//1
        System.out.println(Modifier.toString(aClass8.getModifiers()));//public

//        getTypeName获取参数类型
        System.out.println(aClass8.getTypeName());
//        getName获取参数名称
        System.out.println(aClass8.getName());

//        属性赋值
        Object o1 = aClass8.getConstructor().newInstance();
        Field score1 = aClass8.getField("score");
        score1.set(o1,100);
        System.out.println(o1);//Student{sno=0, height=0.0, weight=0.0, score=100.0}



        //获取字节码信息：
        Class cls = Student.class;
        //获取方法：
        //getMethods:获取运行时类的方法还有所有父类中的方法（被public修饰）
        Method[] methods = cls.getMethods();
        for(Method m:methods){
            System.out.println(m);
        }
        System.out.println("-----------------------");
        //getDeclaredMethods:获取运行时类中的所有方法：
        Method[] declaredMethods = cls.getDeclaredMethods();
        for(Method m:declaredMethods){
            System.out.println(m);
        }
        System.out.println("-----------------------");
        //获取指定的方法：
        Method showInfo1 = cls.getMethod("showInfo");
        System.out.println(showInfo1);
        Method showInfo2 = cls.getMethod("showInfo", int.class, int.class);
        System.out.println(showInfo2);
        Method work = cls.getDeclaredMethod("work",int.class);
        System.out.println(work);
        System.out.println("-----------------------");


        //获取方法的具体结构：
        /*
        @注解
        修饰符 返回值类型  方法名(参数列表) throws XXXXX{}
         */
        //名字：
        System.out.println(work.getName());
        //修饰符：
        int modifiers = work.getModifiers();
        System.out.println(Modifier.toString(modifiers));
        //返回值：
        System.out.println(work.getReturnType());
        //参数列表：
        Class[] parameterTypes = work.getParameterTypes();
        for(Class c:parameterTypes){
            System.out.println(c);
        }
        //获取注解：
        Method myMethod = cls.getMethod("myMethod");
        Annotation[] annotations = myMethod.getAnnotations();
        for(Annotation a:annotations){
            System.out.println(a);
        }
        //获取异常：
        Class[] exceptionTypes = myMethod.getExceptionTypes();
        for(Class c:exceptionTypes){
            System.out.println(c);
        }
        //调用方法：
        Object o3 = cls.newInstance();
        myMethod.invoke(o3);//调用o对象的mymethod方法
        System.out.println(showInfo2.invoke(o3,12,45));
    }
}
