package org.igetwell.system.mapper;

import org.igetwell.system.domain.SystemDepart;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface SystemDepartMapper extends Mapper<SystemDepart> {

    /**
     * 根据机构ID查询机构所有部门
     * @param office
     * @return
     */
    List<SystemDepart> getListByOffice(int office);

    /**
     * 根据部门父节点ID查询子部门（只能拿一层，非递归）
     * @param parentId
     * @return
     */
    List<SystemDepart> getChildren(int parentId);

    /**
     * 根据部门父节点ID查询所有子部门用户（递归）
     * @param parentId
     * @return
     */
    List<SystemDepart> getChildrenList(int parentId);

    /**
     * 根据部门父节点ID查询所有子部门用户（递归）
     * @param parentId
     * @return
     */
    List<SystemDepart> getSystemUserList(int parentId);
}