package org.igetwell.test.system.mapper;

import org.igetwell.system.domain.SystemPostion;
import org.igetwell.system.mapper.SystemPostionMapper;
import org.igetwell.test.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SystemPositionMapperTest extends BaseTest {

    @Autowired
    private SystemPostionMapper systemPostionMapper;

    @Test
    public void getList(){
        List<SystemPostion> postions = systemPostionMapper.getList(1);
        System.err.println(postions.size());
    }

    @Test
    public void getChildrenList(){
        List<SystemPostion> postions = systemPostionMapper.getChildrenList(1);
        System.err.println(postions.size());
    }

}
