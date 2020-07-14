package com.luolight.SeaweedS.models;

import java.io.Serializable;
import java.util.Date;

public class SsUser implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ss_user.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ss_user.usern
     *
     * @mbggenerated
     */
    private String usern;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ss_user.passw
     *
     * @mbggenerated
     */
    private String passw;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ss_user.nick_name
     *
     * @mbggenerated
     */
    private String nickName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ss_user.telphone
     *
     * @mbggenerated
     */
    private String telphone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ss_user.phone_number
     *
     * @mbggenerated
     */
    private String phoneNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ss_user.photo
     *
     * @mbggenerated
     */
    private String photo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ss_user.company
     *
     * @mbggenerated
     */
    private String company;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ss_user.last_login_time
     *
     * @mbggenerated
     */
    private Date lastLoginTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ss_user.type
     *
     * @mbggenerated
     */
    private Short type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ss_user.token
     *
     * @mbggenerated
     */
    private String token;

    private Date createTime;

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ss_user.id
     *
     * @return the value of ss_user.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ss_user.id
     *
     * @param id the value for ss_user.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ss_user.usern
     *
     * @return the value of ss_user.usern
     *
     * @mbggenerated
     */
    public String getUsern() {
        return usern;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ss_user.usern
     *
     * @param usern the value for ss_user.usern
     *
     * @mbggenerated
     */
    public void setUsern(String usern) {
        this.usern = usern == null ? null : usern.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ss_user.passw
     *
     * @return the value of ss_user.passw
     *
     * @mbggenerated
     */
    public String getPassw() {
        return passw;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ss_user.passw
     *
     * @param passw the value for ss_user.passw
     *
     * @mbggenerated
     */
    public void setPassw(String passw) {
        this.passw = passw == null ? null : passw.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ss_user.nick_name
     *
     * @return the value of ss_user.nick_name
     *
     * @mbggenerated
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ss_user.nick_name
     *
     * @param nickName the value for ss_user.nick_name
     *
     * @mbggenerated
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ss_user.telphone
     *
     * @return the value of ss_user.telphone
     *
     * @mbggenerated
     */
    public String getTelphone() {
        return telphone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ss_user.telphone
     *
     * @param telphone the value for ss_user.telphone
     *
     * @mbggenerated
     */
    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ss_user.phone_number
     *
     * @return the value of ss_user.phone_number
     *
     * @mbggenerated
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ss_user.phone_number
     *
     * @param phoneNumber the value for ss_user.phone_number
     *
     * @mbggenerated
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ss_user.photo
     *
     * @return the value of ss_user.photo
     *
     * @mbggenerated
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ss_user.photo
     *
     * @param photo the value for ss_user.photo
     *
     * @mbggenerated
     */
    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ss_user.company
     *
     * @return the value of ss_user.company
     *
     * @mbggenerated
     */
    public String getCompany() {
        return company;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ss_user.company
     *
     * @param company the value for ss_user.company
     *
     * @mbggenerated
     */
    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ss_user.last_login_time
     *
     * @return the value of ss_user.last_login_time
     *
     * @mbggenerated
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ss_user.last_login_time
     *
     * @param lastLoginTime the value for ss_user.last_login_time
     *
     * @mbggenerated
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ss_user.type
     *
     * @return the value of ss_user.type
     *
     * @mbggenerated
     */
    public Short getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ss_user.type
     *
     * @param type the value for ss_user.type
     *
     * @mbggenerated
     */
    public void setType(Short type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ss_user.token
     *
     * @return the value of ss_user.token
     *
     * @mbggenerated
     */
    public String getToken() {
        return token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ss_user.token
     *
     * @param token the value for ss_user.token
     *
     * @mbggenerated
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }
}