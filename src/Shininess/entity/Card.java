package Shininess.entity;

import Shininess.idal.Pay;

/**
 * @author : WangRich
 * @Description : 银行卡支付
 * @date : 2022/7/19 15:28
 */
public class Card implements Pay {
    @Override
    public void payOnline() {
        System.out.println("正在使用银行卡支付");
    }
}
