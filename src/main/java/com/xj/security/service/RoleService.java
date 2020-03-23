package com.xj.security.service;

import com.xj.security.model.SysRole;

import java.util.List;

public interface RoleService {

    public void save(SysRole role);

    public List<SysRole> findAll();

}
