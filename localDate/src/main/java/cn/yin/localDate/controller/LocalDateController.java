package cn.yin.localDate.controller;

import cn.yin.localDate.entity.UserBirthday;
import cn.yin.localDate.vo.UserBirthdayVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocalDateController {

    @PostMapping("/userBirthday")
    public UserBirthdayVO userBirthday(@RequestBody UserBirthday userBirthday) throws Exception {
        UserBirthdayVO  userBirthdayVO  = new UserBirthdayVO();
        userBirthdayVO.setName(userBirthday.getName());
        userBirthdayVO.setBirthday(userBirthday.getBirthday());
        return userBirthdayVO;
    }
}
