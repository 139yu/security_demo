package com.xj.security.service.impl;

import com.xj.security.dao.RoleDao;
import com.xj.security.model.SysRole;
import com.xj.security.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;

    public void save(SysRole role) {
        roleDao.save(role);
    }

    public List<SysRole> findAll() {
        return roleDao.findAll();
    }
}
