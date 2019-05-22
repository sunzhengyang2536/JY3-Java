package com.neuedu.pojo;

public class User {

    public User(){
    }
    public User(String userName,String psw){
        this.userName = userName;
        this.psw = psw;
    }
    private String userName;
    private String psw;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }
}
