package org.igetwell.test.system.service;

import org.igetwell.common.core.Pagination;
import org.igetwell.common.util.ResponseEntity;
import org.igetwell.system.dto.SystemUserDTO;
import org.igetwell.system.query.SystemUserQuery;
import org.igetwell.system.service.ISystemUserService;
import org.igetwell.test.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class SystemUserServiceTest extends BaseTest {
    @Autowired
    private ISystemUserService iSystemUserService;

    @Test
    public void getSystemUsers(){
        SystemUserQuery params = new SystemUserQuery();
        params.setOfficeId(1);
        params.setPageNo(1);
        params.setPageSize(5);
        ResponseEntity<Pagination<SystemUserDTO>> message = iSystemUserService.getList(params);
        System.err.println(message);
    }

}
