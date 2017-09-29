package org.igetwell.system.mapper;

import org.igetwell.system.domain.SystemUser;
import org.igetwell.system.dto.SystemUserDTO;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface SystemUserMapper extends Mapper<SystemUser> {

    /**
     * 根据机构ID查询系统用户信息
     * @param office
     * @return
     */
    List<SystemUserDTO> getSystemUsers(Integer office);
}