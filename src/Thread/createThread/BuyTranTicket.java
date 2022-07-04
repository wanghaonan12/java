package Thread.createThread;

/**
 * @author : WangRich
 * @Description : description
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
                System.out.println(this.getName()+"窗口买到了"+ number-- +i);
            }
        }
    }
}
