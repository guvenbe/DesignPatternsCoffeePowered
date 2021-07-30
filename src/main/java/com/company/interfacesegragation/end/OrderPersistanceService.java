package com.company.interfacesegragation.end;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderPersistanceService implements PersistenceService<Order> {

    private static final Map<Long, Order> ORDERS = new HashMap<>();

    @Override
    public void save(Order order) {
        synchronized (ORDERS){
            ORDERS.put(order.getId(), order);
        }
    }

    @Override
    public void delete(Order order) {
        synchronized (ORDERS){
            ORDERS.remove(order.getId());
        }
    }

    @Override
    public Order findById(Long id) {
        synchronized (ORDERS) {
            return ORDERS.get(id);
        }
    }

}
