package cn.yin.service.impl;

import cn.yin.model.dao.UserMapper;
import cn.yin.model.entity.User;
import cn.yin.model.entity.UserExample;
import cn.yin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void save(User user) {
        userMapper.insertSelective(user);
    }

    @Override
    public User findByName(String name) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andNameEqualTo(name);
        return userMapper.selectByExample(userExample).get(0);
    }
}
