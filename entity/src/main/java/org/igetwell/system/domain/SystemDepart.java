package org.igetwell.system.domain;

import org.igetwell.common.core.SerializableModel;

public class SystemDepart extends SerializableModel {
    /**
     * 编号
     */
    private Integer id;

    /**
     * 部门名称
     */
    private String name;

    /**
     * 上级资源 父节点ID
     */
    private Integer parentId;

    /**
     * 机构编号
     */
    private Integer systemOfficeId;

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
     * 获取部门名称
     *
     * @return name - 部门名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置部门名称
     *
     * @param name 部门名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    /**
     * 获取机构编号
     *
     * @return system_office_id - 机构编号
     */
    public Integer getSystemOfficeId() {
        return systemOfficeId;
    }

    /**
     * 设置机构编号
     *
     * @param systemOfficeId 机构编号
     */
    public void setSystemOfficeId(Integer systemOfficeId) {
        this.systemOfficeId = systemOfficeId;
    }
}