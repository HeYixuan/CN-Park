package org.igetwell.system.dto;

public class SystemUserDTO {
    /**
     * 系统用户编号
     */
    private Integer systemUserId;
    /**
     * 姓名
     */
    private String username;
    /**
     * 机构编号
     */
    private Integer officeId;
    /**
     * 机构名称
     */
    private String officeName;
    /**
     * 部门编号
     */
    private Integer deptId;
    /**
     * 部门名称
     */
    private String deptName;
    /**
     * 职位编号
     */
    private Integer positionId;
    /**
     * 职位名称
     */
    private String positionName;

    public Integer getSystemUserId() {
        return systemUserId;
    }

    public void setSystemUserId(Integer systemUserId) {
        this.systemUserId = systemUserId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Integer officeId) {
        this.officeId = officeId;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }


}
