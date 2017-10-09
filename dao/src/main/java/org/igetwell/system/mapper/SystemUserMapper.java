package org.igetwell.system.mapper;

import org.igetwell.system.domain.SystemUser;
import org.igetwell.system.dto.SystemUserDTO;
import tk.mybatis.mapper.common.Mapper;
import java.util.List;

public interface SystemUserMapper extends Mapper<SystemUser> {

    /**
     * 登录(根据用户名查询)
     * @param username
     * @return
     */
    SystemUser loadByUsername(String username);

    /**
     * 根据机构ID查询系统用户信息
     * @param office
     * @return
     */
    List<SystemUserDTO> getSystemUsers(Integer office);

    /**
     * 根据系统用户名查询系统用户信息
     * @param username
     * @return
     */
    SystemUserDTO get(String username);
}