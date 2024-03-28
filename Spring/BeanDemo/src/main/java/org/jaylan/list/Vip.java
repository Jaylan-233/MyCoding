package org.jaylan.list;


import java.util.List;

/**
 * Vip用户类 包含一个列表
 */
public class Vip {
    //    Vip订单列表
    //    用于存放Order的List
    private List<String> strings;
    private List<Order> orderList;

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
