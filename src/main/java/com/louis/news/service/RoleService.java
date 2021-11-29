package com.louis.news.service;

import com.louis.news.pojo.Role;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 赖小燚
 * www.louis.com
 */
@Service
public interface RoleService {

    List<Role> findRoleList();
}
