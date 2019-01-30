package com.anjubao.ceshiparentserver.entity;

import java.io.Serializable;

/**
 * @Description
 * @Author honghao <bruceza@qq.com>
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2019/1/25
 */
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    private long id;
    private String userName;
    private String passWord;
    private String userSex;
    private String nickName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public UserEntity(long id, String userName, String passWord, String userSex, String nickName) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.userSex = userSex;
        this.nickName = nickName;
    }

    public UserEntity() {
    }
}
