package main.java.com.practice.order;

public interface IOrderService {
    String createOrder(String userId, String item, int qty);
    int getOrdersCount(String userId);
}
