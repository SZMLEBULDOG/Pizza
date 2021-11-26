package pl.maksymilian.pizza.remote.rest.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.maksymilian.pizza.remote.rest.dto.request.AddPizzaDto;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping(value = "/api/v1/pizzas", produces = APPLICATION_JSON_VALUE)
@RestController
public class PizzaController {
    @PostMapping
    public ResponseEntity<AddPizzaDto> addPizza(@RequestBody AddPizzaDto addPizzaDto,
                                                @RequestHeader("Access-Token") String token) {
        return ResponseEntity.ok(null);
    }
    @PutMapping("/2")
    public ResponseEntity<AddPizzaDto> updatePizza(@RequestBody AddPizzaDto addPizzaDto,
                                                   @RequestHeader("Access-Token") String token) {
        return ResponseEntity.ok(null);
    }
    @DeleteMapping("/2")
    public ResponseEntity<AddPizzaDto> deletePizza(@RequestHeader("Access-Token") String token) {
        return ResponseEntity.ok(null);
    }
}

