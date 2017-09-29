package org.igetwell.system.domain;

import org.igetwell.common.core.SerializableModel;


public class SystemRoleResource extends SerializableModel {
    private Integer systemResourceId;

    private Integer systemRoleId;

    /**
     * @return system_resource_id
     */
    public Integer getSystemResourceId() {
        return systemResourceId;
    }

    /**
     * @param systemResourceId
     */
    public void setSystemResourceId(Integer systemResourceId) {
        this.systemResourceId = systemResourceId;
    }

    /**
     * @return system_role_id
     */
    public Integer getSystemRoleId() {
        return systemRoleId;
    }

    /**
     * @param systemRoleId
     */
    public void setSystemRoleId(Integer systemRoleId) {
        this.systemRoleId = systemRoleId;
    }
}