package main.java.com.practice.order;

import java.util.HashMap;
import java.util.Map;

public class OrderServiceImpl implements IOrderService {
    private final Map<String, Integer> counter = new HashMap<>();

    @Override
    public String createOrder(String userId, String item, int qty) {
        if (qty <= 0) throw new IllegalArgumentException("qty inválido");
        counter.merge(userId, 1, Integer::sum);
        return "ORD-" + userId + "-" + counter.get(userId);
    }

    @Override
    public int getOrdersCount(String userId) {
        return counter.getOrDefault(userId, 0);
    }
}
