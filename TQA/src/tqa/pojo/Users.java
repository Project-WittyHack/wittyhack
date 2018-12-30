/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tqa.pojo;

/**
 *
 * @author lenovo
 */
public class Users {

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
    private String userId;
    private String password;
    private String userType;
    private String studUserid;
    private String studPassword;
    private String studReTypePassword;

    public String getStudUserid() {
        return studUserid;
    }

    public void setStudUserid(String studUserid) {
        this.studUserid = studUserid;
    }

    public String getStudPassword() {
        return studPassword;
    }

    public void setStudPassword(String studPassword) {
        this.studPassword = studPassword;
    }

    public String getStudReTypePassword() {
        return studReTypePassword;
    }

    public void setStudReTypePassword(String studReTypePassword) {
        this.studReTypePassword = studReTypePassword;
    }
   
    
}
