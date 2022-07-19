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
@Target:���嵱ǰע���ܹ����γ����е���ЩԪ��
@Retention:����ע�����������
 */
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value();
}
