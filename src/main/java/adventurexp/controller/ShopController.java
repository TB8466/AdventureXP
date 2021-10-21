package adventurexp.controller;

import adventurexp.model.Shop;
import adventurexp.repositories.EmployeeRepository;
import adventurexp.repositories.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    ShopRepository shopRepository;

    @PostMapping(value = "/save", consumes = "application/json")
    public ResponseEntity<Shop> createShop(@RequestBody Shop shop){
        shopRepository.save(shop);
        return new ResponseEntity<Shop>(shop, HttpStatus.CREATED);
    }
}
