package com.louis.news.service.impl;

import com.louis.news.mapper.UserMapper;
import com.louis.news.pojo.User;
import com.louis.news.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 赖小燚
 * www.louis.com
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findUserList(String keywords, Integer userListRoleId) {
        return userMapper.selectUserList(keywords,userListRoleId);
    }

    @Override
    public User findUser(String loginName, String password) {
        return userMapper.findUser(loginName,password);
    }

    @Override
    public User getUserByUserId(Integer userId) {
        return userMapper.getUserByUserId(userId);
    }

    @Override
    public User getUserByLoginName(String loginName) {
        return userMapper.getUserByLoginName(loginName);
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public int editUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public int delUser(Integer userId) {
        return userMapper.delUser(userId);
    }

    @Override
    public int setUserStatus(User user) {
        return userMapper.setUserStatus(user);
    }
}
