package Thread.createThread;

/**
 * @author : WangRich
 * @Description : 通过继承Thread类实现多线程创建
 * @date : 2022/7/4 14:30
 */
public class Thread1 extends Thread {

    public Thread1(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("线程1运行: ————"+i+"次————");
        }
    }
}
