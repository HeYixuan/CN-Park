package org.igetwell.system.domain;

import org.igetwell.common.core.SerializableModel;

public class SystemUserRole extends SerializableModel {
    private Integer systemUserId;

    private Integer systemRoleId;

    /**
     * @return system_user_id
     */
    public Integer getSystemUserId() {
        return systemUserId;
    }

    /**
     * @param systemUserId
     */
    public void setSystemUserId(Integer systemUserId) {
        this.systemUserId = systemUserId;
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