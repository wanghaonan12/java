package Thread.createThread;

/**
 * @author : WangRich
 * @Description : 通过实现Runnable接口实现多线程创建
 * @date : 2022/7/4 14:31
 */
public class Thread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("线程2运行: ****"+i+"次****");
        }
    }
}
