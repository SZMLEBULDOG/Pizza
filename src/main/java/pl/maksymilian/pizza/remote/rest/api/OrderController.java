package pl.maksymilian.pizza.remote.rest.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.maksymilian.pizza.domain.model.OrderStatusType;
import pl.maksymilian.pizza.remote.rest.dto.request.AddOrderDto;
import pl.maksymilian.pizza.remote.rest.dto.request.UpdateOrderDto;
import pl.maksymilian.pizza.remote.rest.dto.response.OrderCollection;
import pl.maksymilian.pizza.remote.rest.dto.response.OrderDto;
import pl.maksymilian.pizza.remote.rest.dto.response.OrderStatusDto;
import pl.maksymilian.pizza.remote.rest.dto.response.TokenDto;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping(value = "/api/v1/orders", produces = APPLICATION_JSON_VALUE)
@RestController
public class OrderController {
    @PostMapping
    public ResponseEntity<TokenDto> addOrder(@RequestBody AddOrderDto addOrderDto){
        return ResponseEntity.ok(null);
    }
    @GetMapping
    public ResponseEntity<OrderCollection> getOrders(@RequestParam("status") OrderStatusType orderStatusType,
                                                        @RequestHeader("Access-Token") String token){
        return ResponseEntity.ok(null);
    }
    @GetMapping("/status/{token}")
    public ResponseEntity<OrderStatusDto> getStatus(@PathVariable("token")String token){
        return ResponseEntity.ok(null);
    }
    @DeleteMapping("/{order-id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable("order-id")Integer orderId,
                                            @RequestHeader("Access-Token")String token) {
        return ResponseEntity.ok(null);
    }
    @PutMapping("/{order-id}")
    public ResponseEntity<OrderDto> updateOrder(@RequestHeader("Access-Token")String token,
                                                @PathVariable("order-id")Integer orderId,
                                                @RequestBody UpdateOrderDto updateOrderDto) {
        return ResponseEntity.ok(null);
    }
}
