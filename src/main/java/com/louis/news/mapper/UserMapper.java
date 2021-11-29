package com.louis.news.mapper;

import com.louis.news.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 赖小燚
 * www.louis.com
 */
@Repository
public interface UserMapper {

    //查询所有用户
    List<User> selectUserList(@Param("keywords")String keywords,@Param("userListRoleId")Integer userListRoleId);

    //通过账号和密码查询用户
    User findUser(@Param("loginName")String loginName,@Param("password")String password);

    //通过userId查询用户
    User getUserByUserId(Integer userId);

    //通过用户登录名查询用户(用户判断用户名是否存在)
    User getUserByLoginName(String loginName);

    //添加用户
    int addUser(User user);

    //更新用户
    int updateUser(User user);

    //删除用户
    int delUser(Integer userId);

    //设置用户状态
    int setUserStatus(User user);
}
