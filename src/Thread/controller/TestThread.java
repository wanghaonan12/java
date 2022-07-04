package Thread.controller;

import Thread.createThread.BuyTranTicket;
import Thread.createThread.Thread1;
import Thread.createThread.Thread2;
import Thread.createThread.Thread3;

import java.util.concurrent.FutureTask;

/**
 * @author : WangRich
 * @Description : description
 * @date : 2022/7/4 14:30
 */
public class TestThread {
    public static void main(String[] args) {

//
//        Thread1 thread1 = new Thread1("子线程");
//        Thread2 th2 = new Thread2();
//        Thread thread2= new Thread(th2);
//        Thread3 th3 = new Thread3();
//        FutureTask<Integer> thr3 = new FutureTask<>(th3);
//        Thread thread3 = new Thread(thr3);
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        for (int i = 0; i < 200; i++) {
//            System.out.println("主线程运行: ~~~~" + i + "次~~~~");
//        }


        BuyTranTicket buy1 = new BuyTranTicket("一号");
        BuyTranTicket buy2 = new BuyTranTicket("二号");
        BuyTranTicket buy3 = new BuyTranTicket("三号");

        buy1.start();
        buy2.start();
        buy3.start();

    }
}
