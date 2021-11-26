package pl.maksymilian.pizza.remote.rest.dto.response;

import java.util.List;

public class OrderCollection {

    private List<OrderDto> orders;
    public OrderCollection() {
    }
    public OrderCollection(List<OrderDto> orders) {
        this.orders = orders;
    }
    public List<OrderDto> getOrders() {
        return orders;
    }
    public void setOrders(List<OrderDto> orders) {
        this.orders = orders;
    }
}
