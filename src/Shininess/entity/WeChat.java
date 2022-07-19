package Shininess.entity;

import Shininess.idal.Pay;

/**
 * @author : WangRich
 * @Description : 微信支付
 * @date : 2022/7/19 15:28
 */
public class WeChat implements Pay {
    @Override
    public void payOnline() {
        System.out.println("正在使用微信支付");
    }
}
