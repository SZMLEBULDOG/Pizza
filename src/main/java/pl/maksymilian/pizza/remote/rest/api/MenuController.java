package pl.maksymilian.pizza.remote.rest.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.maksymilian.pizza.remote.rest.dto.response.MenuDto;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping(value = "/api/v1/menu", produces = APPLICATION_JSON_VALUE)
@RestController
public class MenuController {
    @GetMapping
    public ResponseEntity<MenuDto> getMenu(@RequestBody MenuDto menuDto){
        return ResponseEntity.ok(menuDto);
    }
}
