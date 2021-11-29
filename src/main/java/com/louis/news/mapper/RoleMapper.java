package com.louis.news.mapper;

import com.louis.news.pojo.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 赖小燚
 * www.louis.com
 */
@Repository
public interface RoleMapper {
    //查询所有角色信息
    List<Role> selectRoleList();
}
