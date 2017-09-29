package org.igetwell.test.system.mapper;

import org.igetwell.system.dto.SystemUserDTO;
import org.igetwell.system.mapper.SystemUserMapper;
import org.igetwell.test.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SystemUserMapperTest extends BaseTest {

    @Autowired
    private SystemUserMapper systemUserMapper;

    @Test
    public void getSystemUsers(){
        List<SystemUserDTO> dtos = systemUserMapper.getSystemUsers(1);
        System.err.println(dtos.size());
    }
}
