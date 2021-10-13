package adventurexp.repositories;

import adventurexp.model.Activity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ActivityRepositoryTest {

    @Autowired
    ActivityRepository activityRepository;

    @Test
    void getActivity() throws Exception{
        /*Tjekker DB for hvor mange activities der er. Husk at sætte "spring.jpa.hibernate.ddl-auto=update"
        i application properties når vi tester */

        List<Activity> activityList = activityRepository.findAll();
        assertEquals(4, activityList.size());
    }

}
