package org.igetwell.system.service.impl;

import com.github.pagehelper.PageHelper;
import org.igetwell.common.constans.HttpStatus;
import org.igetwell.common.core.Pagination;
import org.igetwell.common.util.ResponseEntity;
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

    @Override
    public ResponseEntity<Pagination<SystemUserDTO>> getList(SystemUserQuery params) {
        PageHelper.startPage(params.getPageNo(), params.getPageSize());
        List<SystemUserDTO> dtos = systemUserMapper.getSystemUsers(params.getOfficeId());
        Pagination<SystemUserDTO> pagination = new Pagination<SystemUserDTO>(dtos);
        return new ResponseEntity<Pagination<SystemUserDTO>>(pagination);
    }
}
