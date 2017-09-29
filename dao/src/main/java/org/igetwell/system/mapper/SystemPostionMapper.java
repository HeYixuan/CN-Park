package org.igetwell.system.mapper;

import org.igetwell.system.domain.SystemPostion;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface SystemPostionMapper extends Mapper<SystemPostion> {

    /**
     * 根据部门ID查询部门所有职位
     * @param dept
     * @return
     */
    List<SystemPostion> getList(Integer dept);

    /**
     * 根据职位父节点ID查询所有子职位（递归）
     * @param parentId
     * @return
     */
    List<SystemPostion> getChildrenList(Integer parentId);
}