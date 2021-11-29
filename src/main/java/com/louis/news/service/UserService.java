package com.louis.news.service;

import com.louis.news.pojo.User;

import java.util.List;

/**
 * 赖小燚
 * www.louis.com
 */
public interface UserService {

    List<User> findUserList(String keywords,Integer userListRoleId);
    User findUser(String loginName,String password);
    User getUserByUserId(Integer userId);
    User getUserByLoginName(String loginName);
    int addUser(User user);
    int editUser(User user);
    int delUser(Integer userId);
    int setUserStatus(User user);
}
