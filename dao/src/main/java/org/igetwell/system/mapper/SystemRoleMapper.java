package org.igetwell.system.mapper;

import org.igetwell.system.domain.SystemRole;
import tk.mybatis.mapper.common.Mapper;
import java.util.List;

public interface SystemRoleMapper extends Mapper<SystemRole> {

    /**
     * 根据系统用户ID查询用户所拥有的角色
     * @param user
     * @return
     */
    public List<SystemRole> loadByUser(Integer user);


    /**
     * 查询所有的角色
     * @return
     */
    public List<SystemRole> getList();
}