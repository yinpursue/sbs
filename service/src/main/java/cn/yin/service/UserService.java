package cn.yin.service;

import cn.yin.model.entity.User;

public interface UserService {
    void save(User user);
    User findByName(String name);
}
