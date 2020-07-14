package com.luolight.SeaweedS.models;

import java.util.Date;

public class SsModuleWo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ss_module_wo.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ss_module_wo.module_id
     *
     * @mbggenerated
     */
    private Integer moduleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ss_module_wo.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ss_module_wo.type
     *
     * @mbggenerated
     */
    private Short type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ss_module_wo.description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ss_module_wo.pic
     *
     * @mbggenerated
     */
    private String pic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ss_module_wo.time
     *
     * @mbggenerated
     */
    private Date time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ss_module_wo.operation_level
     *
     * @mbggenerated
     */
    private Short operationLevel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ss_module_wo.status
     *
     * @mbggenerated
     */
    private Short status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ss_module_wo.id
     *
     * @return the value of ss_module_wo.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ss_module_wo.id
     *
     * @param id the value for ss_module_wo.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ss_module_wo.module_id
     *
     * @return the value of ss_module_wo.module_id
     *
     * @mbggenerated
     */
    public Integer getModuleId() {
        return moduleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ss_module_wo.module_id
     *
     * @param moduleId the value for ss_module_wo.module_id
     *
     * @mbggenerated
     */
    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ss_module_wo.user_id
     *
     * @return the value of ss_module_wo.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ss_module_wo.user_id
     *
     * @param userId the value for ss_module_wo.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ss_module_wo.type
     *
     * @return the value of ss_module_wo.type
     *
     * @mbggenerated
     */
    public Short getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ss_module_wo.type
     *
     * @param type the value for ss_module_wo.type
     *
     * @mbggenerated
     */
    public void setType(Short type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ss_module_wo.description
     *
     * @return the value of ss_module_wo.description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ss_module_wo.description
     *
     * @param description the value for ss_module_wo.description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ss_module_wo.pic
     *
     * @return the value of ss_module_wo.pic
     *
     * @mbggenerated
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ss_module_wo.pic
     *
     * @param pic the value for ss_module_wo.pic
     *
     * @mbggenerated
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ss_module_wo.time
     *
     * @return the value of ss_module_wo.time
     *
     * @mbggenerated
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ss_module_wo.time
     *
     * @param time the value for ss_module_wo.time
     *
     * @mbggenerated
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ss_module_wo.operation_level
     *
     * @return the value of ss_module_wo.operation_level
     *
     * @mbggenerated
     */
    public Short getOperationLevel() {
        return operationLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ss_module_wo.operation_level
     *
     * @param operationLevel the value for ss_module_wo.operation_level
     *
     * @mbggenerated
     */
    public void setOperationLevel(Short operationLevel) {
        this.operationLevel = operationLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ss_module_wo.status
     *
     * @return the value of ss_module_wo.status
     *
     * @mbggenerated
     */
    public Short getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ss_module_wo.status
     *
     * @param status the value for ss_module_wo.status
     *
     * @mbggenerated
     */
    public void setStatus(Short status) {
        this.status = status;
    }
}