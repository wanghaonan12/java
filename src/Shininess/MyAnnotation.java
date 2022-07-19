package Shininess;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * @author : WangRich
 * @Description : description
 * @date : 2022/7/19 21:15
 */
/*
@Target:定义当前注解能够修饰程序中的哪些元素
@Retention:定义注解的声明周期
 */
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value();
}
