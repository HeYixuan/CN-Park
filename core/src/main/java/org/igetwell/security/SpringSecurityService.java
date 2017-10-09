package org.igetwell.security;

import org.igetwell.system.domain.SystemRole;
import org.igetwell.system.domain.SystemUser;
import org.igetwell.system.mapper.SystemRoleMapper;
import org.igetwell.system.mapper.SystemUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class SpringSecurityService implements UserDetailsService {
    @Autowired
    private SystemUserMapper systemUserMapper;
    @Autowired
    private SystemRoleMapper systemRoleMapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SystemUser systemUser = systemUserMapper.loadByUsername(username);
        if (null == systemUser){
            throw new UsernameNotFoundException("用户账号 " + username + " 不存在");
        }
        //这个方法里实现了根据用户查询用户所有的角色
        List<SystemRole> roles = systemRoleMapper.loadByUser(systemUser.getId());
        //定义权限集合
        Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        roles.forEach(role -> {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        });

        return new User(
                systemUser.getUsername(),
                systemUser.getPassword(),
                true, true, true,true,authorities);
    }
}
