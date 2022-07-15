package Thread.createThread;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * @author : WangRich
 * @Description : 通过实现Callable<Integer>接口实现多线程创建  1.实现Callable接口好处：（1）有返回值  （2）能抛出异常     2.缺点：线程创建比较麻烦
 * @date : 2022/7/4 14:31
 */
public class Thread3 implements Callable<Integer> {
      /*
        1.实现Callable接口，可以不带泛型，如果不带泛型，那么call方式的返回值就是Object类型
        2.如果带泛型，那么call的返回值就是泛型对应的类型
        3.从call方法看到：方法有返回值，可以跑出异常
     */

    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < 200; i++) {
            System.out.println("线程3运行: @@@@"+i+"次@@@@");
        }
        return new Random().nextInt(10);
    }
}

