package org.igetwell.test.system.mapper;

import org.igetwell.system.domain.SystemDepart;
import org.igetwell.system.mapper.SystemDepartMapper;
import org.igetwell.test.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.List;

public class SystemDepartMapperTest extends BaseTest {

    @Autowired
    private SystemDepartMapper systemDepartMapper;

    @Test
    public void getListByOffice(){
        List<SystemDepart> departs = systemDepartMapper.getListByOffice(1);
        if (CollectionUtils.isEmpty(departs)){
            System.err.println("null");
        }
        System.err.println(departs.toString());
    }

    @Test
    public void getChildren(){
        List<SystemDepart> departs = systemDepartMapper.getChildren(1);
        if (CollectionUtils.isEmpty(departs)){
            System.err.println("null");
        }
        System.err.println(departs.size());
    }

    @Test
    public void getChildrenList(){
        List<SystemDepart> departs = systemDepartMapper.getChildrenList(1);
        if (CollectionUtils.isEmpty(departs)){
            System.err.println("null");
        }
        System.err.println(departs.size());
    }

    @Test
    public void getSystemUsers(){
        List<SystemDepart> departs = systemDepartMapper.getChildrenList(1);
        if (CollectionUtils.isEmpty(departs)){
            System.err.println("null");
        }
        System.err.println(departs.size());
    }
}
