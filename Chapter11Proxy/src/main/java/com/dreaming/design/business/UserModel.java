package com.dreaming.design.business;
/**
 *描述用户数据的对象
 */
public class UserModel {
    /**
     *用户编号
     */
    private String userId;
    /**
     * 用户姓名
     */
    private String name;
    /**
     *部门编号
     */
    private String depId;
    /**
     *性别
     */
    private String sex;

    public UserModel(){

    }
    public UserModel(String userId, String name, String depId, String sex){
        this.userId = userId;
        this.name   = name;
        this.depId  = depId;
        this.sex    = sex;
    }

    public String getUserId(){
        return userId;
    }
    public UserModel setUserId (String userId) {
        this.userId = userId;
        return this;
    }
    public String getName() {
        return name;
    }
    public UserModel setName (String name) {
        this.name = name;
        return this;
    }
    public String getDepId() {
        return depId;
    }
    public UserModel setDepId(String depId) {
        this.depId = depId;
        return this;
    }
    public String getSex(){
        return sex;
    }
    public UserModel setSex(String sex) {
        this.sex = sex;
        return this;
    }
    public String toString () {
        return "userId=" + userId +
                ", name=" + name +
                ", depId=" + depId +
                ", sex=" + sex + " \n";
    }
}
