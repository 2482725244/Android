package com.example.textproject;

public class UserBean {
    private static String user;
    private static String pwd;
    private static UserBean ub;

   private UserBean(){

   }

    public static UserBean GetUserBean(){
        if (ub == null){
            ub = new UserBean();
        }
        return ub;
    }


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
