package com.iris.springbootsecurity.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;


public class SysRole implements Serializable {
    private Long id;
    private String roleCode;
    private String roleName;
    private List<SysPermission> permissionList;

    public SysRole() {
    }

    public SysRole(String roleCode, String roleName) {
        this.roleCode = roleCode;
        this.roleName = roleName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<SysPermission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<SysPermission> permissionList) {
        this.permissionList = permissionList;
    }

    @Override
    public String toString() {
        return "SysRole{" +
                "id=" + id +
                ", roleCode='" + roleCode + '\'' +
                ", roleName='" + roleName + '\'' +
                ", permissionList=" + permissionList +
                '}';
    }
}
