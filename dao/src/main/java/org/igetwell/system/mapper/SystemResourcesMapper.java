package org.igetwell.system.mapper;

import org.igetwell.system.domain.SystemResources;
import tk.mybatis.mapper.common.Mapper;
import java.util.List;

public interface SystemResourcesMapper extends Mapper<SystemResources> {

    /**
     * 根据角色查询角色拥有的权限
     * @param role
     * @return
     */
    List<SystemResources> loadByRole(Integer role);

    /**
     * 根据所有权限
     * @return
     */
    List<SystemResources> getList();

    /**
     * 查询未关联的权限
     * @return
     */
    List<SystemResources> getUnBingList();

}