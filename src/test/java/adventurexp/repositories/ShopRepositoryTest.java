package adventurexp.repositories;

import adventurexp.model.Shop;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ShopRepositoryTest {

    @Autowired
    ShopRepository shopRepository;

    @Test
    void getShop() throws Exception{
        /*Tjekker DB for hvor mange shops der er. Husk at sætte "spring.jpa.hibernate.ddl-auto=update"
        i application properties når vi tester */

        List<Shop> shopList = shopRepository.findAll();
        assertEquals(4, shopList.size());
    }

}
