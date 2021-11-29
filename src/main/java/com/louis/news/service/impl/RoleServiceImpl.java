package com.louis.news.service.impl;

import com.louis.news.mapper.RoleMapper;
import com.louis.news.pojo.Role;
import com.louis.news.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 赖小燚
 * www.louis.com
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> findRoleList() {
        return roleMapper.selectRoleList();
    }
}
