package com.luolight.SeaweedS.models;

public class LuolightApitype {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column luolight_apitype.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column luolight_apitype.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column luolight_apitype.desc
     *
     * @mbggenerated
     */
    private String desc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column luolight_apitype.cla
     *
     * @mbggenerated
     */
    private String cla;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column luolight_apitype.id
     *
     * @return the value of luolight_apitype.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column luolight_apitype.id
     *
     * @param id the value for luolight_apitype.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column luolight_apitype.name
     *
     * @return the value of luolight_apitype.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column luolight_apitype.name
     *
     * @param name the value for luolight_apitype.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column luolight_apitype.desc
     *
     * @return the value of luolight_apitype.desc
     *
     * @mbggenerated
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column luolight_apitype.desc
     *
     * @param desc the value for luolight_apitype.desc
     *
     * @mbggenerated
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column luolight_apitype.cla
     *
     * @return the value of luolight_apitype.cla
     *
     * @mbggenerated
     */
    public String getCla() {
        return cla;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column luolight_apitype.cla
     *
     * @param cla the value for luolight_apitype.cla
     *
     * @mbggenerated
     */
    public void setCla(String cla) {
        this.cla = cla == null ? null : cla.trim();
    }
}