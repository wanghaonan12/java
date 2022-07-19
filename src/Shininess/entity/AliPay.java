package Shininess.entity;

import Shininess.idal.Pay;

/**
 * @author : WangRich
 * @Description : 支付宝支付
 * @date : 2022/7/19 15:27
 */
public class AliPay implements Pay {
    @Override
    public void payOnline() {
        System.out.println("正在使用支付宝支付");
    }
}
