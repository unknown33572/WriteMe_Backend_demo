package org.demo.writeme_demo.service;

import lombok.RequiredArgsConstructor;
import org.demo.writeme_demo.dao.UserMapper;
import org.demo.writeme_demo.dto.User;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;

    public User getUserById(int id) {
        return userMapper.selectUserById(id);
    }

    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }
}
