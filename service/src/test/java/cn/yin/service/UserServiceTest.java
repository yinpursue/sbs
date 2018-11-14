package cn.yin.service;

import cn.yin.Start;
import cn.yin.model.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.CacheManager;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Start.class)
public class UserServiceTest {
    @Autowired
    private CacheManager cacheManager;

    @Autowired
    private UserService userService;

    @Test
    public void save() {
        User user = new User();
        user.setName("jerry");
        user.setAge(18);
        userService.save(user);
    }

    @Test
    public void findByName() {
        cacheManager.getCacheNames();
        User u1 = userService.findByName("jerry");
        System.out.println("第一次查询：" + u1.getAge());

        User u2 = userService.findByName("jerry");
        System.out.println("第二次查询：" + u2.getAge());
    }
}