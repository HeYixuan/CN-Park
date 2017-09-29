package org.igetwell.system.mapper;

import org.igetwell.system.domain.SystemDepart;
import org.igetwell.system.domain.SystemOffice;
import org.igetwell.system.domain.SystemPostion;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface SystemOfficeMapper extends Mapper<SystemOffice> {

    /**
     * 根据机构ID查询机构所有部门
     * @param office
     * @return
     */
    List<SystemDepart> getDepts(Integer office);

    /**
     * 根据机构ID查询机构所有职位
     * @param office
     * @return
     */
    List<SystemPostion> getPositions(Integer office);
}