import com.test.config.ApplicationConfig;
import com.test.pojo.User;
import com.test.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Optional;

//@ContextConfiguration("/spring.xml")
@ContextConfiguration(classes = ApplicationConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringDataJpaTest {


    @Autowired
    UserRepository userRepository;


    @Test
    public void testUpdate() {
        Optional<User> user = userRepository.findById(1L);
        System.out.println(user);
    }

    @Test
    public void testInsert() {
        User user = new User();
        user.setUserName("HJF");
        user.setUserAge(28);
        User user1 = userRepository.save(user);
        System.out.println(user1);
    }

    @Test
    public void testPage() {
        User user = userRepository.getByUserName("HJF");
        Example example = null;
        userRepository.findAll(example);
        System.out.println(user);
    }
}
