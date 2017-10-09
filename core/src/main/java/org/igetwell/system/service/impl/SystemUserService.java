package org.igetwell.system.service.impl;

import com.github.pagehelper.PageHelper;
import org.igetwell.common.core.Pagination;
import org.igetwell.common.util.ResponseEntity;
import org.igetwell.system.domain.SystemUser;
import org.igetwell.system.dto.SystemUserDTO;
import org.igetwell.system.mapper.SystemUserMapper;
import org.igetwell.system.query.SystemUserQuery;
import org.igetwell.system.service.ISystemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemUserService implements ISystemUserService {
    @Autowired
    private SystemUserMapper systemUserMapper;

    /**
     * 登录(根据用户名查询)
     * @param username
     * @return
     */
    public SystemUser loadByUsername(String username) {
        return systemUserMapper.loadByUsername(username);
    }
    /**
     * 根据机构ID查询系统用户信息
     * @param params
     * @return
     */
    public ResponseEntity<Pagination<SystemUserDTO>> getList(SystemUserQuery params) {
        PageHelper.startPage(params.getPageNo(), params.getPageSize());
        List<SystemUserDTO> dtos = systemUserMapper.getSystemUsers(params.getOfficeId());
        Pagination<SystemUserDTO> pagination = new Pagination<SystemUserDTO>(dtos);
        return new ResponseEntity<Pagination<SystemUserDTO>>(pagination);
    }

    /**
     * 根据系统用户名查询系统用户信息
     */
    public SystemUserDTO get(String username) {
        return systemUserMapper.get(username);
    }
}
