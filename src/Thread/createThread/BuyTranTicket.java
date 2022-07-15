package Thread.createThread;

/**
 * @author : WangRich
 * @Description : 多线程购买火车票方法
 * @date : 2022/7/4 15:20
 */
public class BuyTranTicket extends Thread {
    static int number = 20;

    public BuyTranTicket(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (number > 0) {
                System.out.println(this.getName() + "窗口购买了第" + number-- + "张车票在第" + i + "次");
            }
        }
    }
}
