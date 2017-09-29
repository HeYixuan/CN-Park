package org.igetwell.system.service;

import org.igetwell.common.core.Pagination;
import org.igetwell.common.util.ResponseEntity;
import org.igetwell.system.dto.SystemUserDTO;
import org.igetwell.system.query.SystemUserQuery;

import java.util.List;

public interface ISystemUserService {

    ResponseEntity<Pagination<SystemUserDTO>> getList(SystemUserQuery params);
}
