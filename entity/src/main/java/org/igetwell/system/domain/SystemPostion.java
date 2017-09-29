package org.igetwell.system.domain;

import org.igetwell.common.core.SerializableModel;

public class SystemPostion extends SerializableModel {
    /**
     * 编号
     */
    private Integer id;

    /**
     * 职位名称
     */
    private String name;

    /**
     * 部门编号
     */
    private Integer systemDepartId;

    /**
     * 上级资源 父节点ID
     */
    private Integer parentId;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取职位名称
     *
     * @return name - 职位名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置职位名称
     *
     * @param name 职位名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return system_depart_id
     */
    public Integer getSystemDepartId() {
        return systemDepartId;
    }

    /**
     * @param systemDepartId
     */
    public void setSystemDepartId(Integer systemDepartId) {
        this.systemDepartId = systemDepartId;
    }

    /**
     * 获取上级资源 父节点ID
     *
     * @return parent_id - 上级资源 父节点ID
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置上级资源 父节点ID
     *
     * @param parentId 上级资源 父节点ID
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}