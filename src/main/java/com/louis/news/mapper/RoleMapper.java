package com.louis.news.mapper;

import com.louis.news.pojo.Role;
import org.springframework.stereotype.Repository;

/**
 * 赖小燚
 * www.louis.com
 */
@Repository
public interface RoleMapper {
    Role getRoleById(Integer roleId);
}
