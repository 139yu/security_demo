package com.xj.security.service;

import com.xj.security.model.SysUser;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Map;

public interface UserService extends UserDetailsService {

    public void save(SysUser user);

    public List<SysUser> findAll();

    public Map<String, Object> toAddRolePage(Integer id);

    public void addRoleToUser(Integer userId, Integer[] ids);
}
