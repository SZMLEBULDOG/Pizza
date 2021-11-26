package pl.maksymilian.pizza.remote.rest.dto.response;

import pl.maksymilian.pizza.domain.model.OrderStatusType;
import pl.maksymilian.pizza.remote.rest.dto.request.PersonOrderDto;
import pl.maksymilian.pizza.remote.rest.dto.request.PizzaOrderDto;

import java.util.List;

public class OrderDto {

    private Integer id;
    private String status;
    private List<PizzaOrderDto> pizzas;
    private PersonOrderDto person;
    public OrderDto() {
    }
    public OrderDto(Integer id, String status, List<PizzaOrderDto> pizzas, PersonOrderDto person) {
        this.id = id;
        this.status = status;
        this.pizzas = pizzas;
        this.person = person;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public List<PizzaOrderDto> getPizzas() {
        return pizzas;
    }
    public void setPizzas(List<PizzaOrderDto> pizzas) {
        this.pizzas = pizzas;
    }
    public PersonOrderDto getPerson() {
        return person;
    }
    public void setPerson(PersonOrderDto person) {
        this.person = person;
    }
}
