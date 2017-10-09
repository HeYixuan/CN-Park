package org.igetwell.system.service;

import org.igetwell.common.core.Pagination;
import org.igetwell.common.util.ResponseEntity;
import org.igetwell.system.domain.SystemUser;
import org.igetwell.system.dto.SystemUserDTO;
import org.igetwell.system.query.SystemUserQuery;

public interface ISystemUserService {

    /**
     * 登录(根据用户名查询)
     * @param username
     * @return
     */
    SystemUser loadByUsername(String username);

    /**
     * 根据机构ID查询系统用户信息
     * @param params
     * @return
     */
    ResponseEntity<Pagination<SystemUserDTO>> getList(SystemUserQuery params);

    /**
     * 根据系统用户名查询系统用户信息
     */
    SystemUserDTO get(String username);
}
