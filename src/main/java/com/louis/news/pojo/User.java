package com.louis.news.pojo;

import java.util.Date;

/**
 * 赖小燚
 * www.louis.com
 */
public class User {
    private Integer id; //用户Id
    private String userName;    //用户名
    private String loginName;   //登录名
    private String password;    //登录密码
    private String tel; //电话号码
    private Date registerTime;  //注册或修改用户时间
    private String status;  //用户状态 1：未启用 2：已启用 3：被禁用
    private Integer roleId; //用户对应的角色Id
    private String roleName;    //角色名称

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", tel='" + tel + '\'' +
                ", registerTime=" + registerTime +
                ", status='" + status + '\'' +
                ", roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
