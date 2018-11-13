package cn.yin.service;

import cn.yin.Start;
import cn.yin.model.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Start.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void save() {
        User user = new User();
        user.setName("tom");
        user.setAge(18);
        userService.save(user);
    }

    @Test
    public void findByName() {
        User u1 = userService.findByName("tom");
        System.out.println("第一次查询：" + u1.getAge());

        User u2 = userService.findByName("tom");
        System.out.println("第二次查询：" + u2.getAge());
    }
}