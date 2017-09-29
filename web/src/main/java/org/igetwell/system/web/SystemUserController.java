package org.igetwell.system.web;

import org.igetwell.common.core.Pagination;
import org.igetwell.common.util.ResponseEntity;
import org.igetwell.system.dto.SystemUserDTO;
import org.igetwell.system.query.SystemUserQuery;
import org.igetwell.system.service.ISystemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/systemUser")
public class SystemUserController {

    @Autowired
    private ISystemUserService iSystemUserService;

    @PostMapping("/getList")
    public ResponseEntity<Pagination<SystemUserDTO>> getList(@RequestBody SystemUserQuery params){
        return iSystemUserService.getList(params);
    }

}
