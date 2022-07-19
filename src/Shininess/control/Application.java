package Shininess.control;

import Shininess.entity.AliPay;
import Shininess.entity.Card;
import Shininess.entity.WeChat;
import Shininess.idal.Pay;

/**
 * @author : WangRich
 * @Description : 正常支付选择支付方式购物软件模拟
 * @date : 2022/7/19 15:31
 */
public class Application {
    public static void main(String[] args) {
//        模拟前台传入的支付方式
        String payMethond = "支付宝";

//        支付方式判断
        switch (payMethond) {
            case "支付宝" -> pay(new AliPay());
            case "微信" -> pay(new WeChat());
            case "银行卡" -> pay(new Card());
            default -> pay(new AliPay());
        }
    }

    /**
     * 支付功能
     */
    public static void pay(Pay p) {
        p.payOnline();
    }
}
