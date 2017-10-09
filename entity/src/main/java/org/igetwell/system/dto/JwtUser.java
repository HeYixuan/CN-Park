package org.igetwell.system.dto;

import org.igetwell.common.core.SerializableModel;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class JwtUser extends SerializableModel {
    /**
     * 用户名
     */
    private String username;
    /**
     * 机构名称
     */
    private String officeName;
    /**
     * 部门名称
     */
    private String deptName;
    /***
     * 职位名称
     */
    private String positionName;
    /**
     * 角色
     */
    private Collection<? extends GrantedAuthority> authorities;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }


    public JwtUser(String username, String officeName, String deptName, String positionName, Collection<? extends GrantedAuthority> authorities) {
        this.username = username;
        this.officeName = officeName;
        this.deptName = deptName;
        this.positionName = positionName;
        this.authorities = authorities;
    }

    public static JwtUser build(String username, String officeName, String deptName, String positionName, Collection<? extends GrantedAuthority> authorities) {
        return new JwtUser(username, officeName, deptName, positionName, authorities);
    }
}
