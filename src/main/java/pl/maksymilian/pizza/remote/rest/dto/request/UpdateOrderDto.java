package pl.maksymilian.pizza.remote.rest.dto.request;

import pl.maksymilian.pizza.domain.model.OrderStatusType;

import java.util.List;

public class UpdateOrderDto {

    private OrderStatusType status;
    private List<PizzaOrderDto> pizzas;
    private PersonOrderDto personOrderDto;

    public UpdateOrderDto() {
    }

    public UpdateOrderDto(OrderStatusType status, List<PizzaOrderDto> pizzas, PersonOrderDto personOrderDto) {
        this.status = status;
        this.pizzas = pizzas;
        this.personOrderDto = personOrderDto;

    }

    public OrderStatusType getStatus() {
        return status;
    }

    public void setStatus(OrderStatusType status) {
        this.status = status;
    }

    public List<PizzaOrderDto> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<PizzaOrderDto> pizzas) {
        this.pizzas = pizzas;
    }

    public PersonOrderDto getPersonOrderDto() {
        return personOrderDto;
    }

    public void setPersonOrderDto(PersonOrderDto personOrderDto) {
        this.personOrderDto = personOrderDto;
    }
}
