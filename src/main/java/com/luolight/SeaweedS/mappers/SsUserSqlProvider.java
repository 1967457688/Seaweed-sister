package com.luolight.SeaweedS.mappers;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.luolight.SeaweedS.models.SsUser;

public class SsUserSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ss_user
     *
     * @mbggenerated
     */
    public String insertSelective(SsUser record) {
        BEGIN();
        INSERT_INTO("ss_user");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getUsern() != null) {
            VALUES("usern", "#{usern,jdbcType=VARCHAR}");
        }
        
        if (record.getPassw() != null) {
            VALUES("passw", "#{passw,jdbcType=VARCHAR}");
        }
        
        if (record.getNickName() != null) {
            VALUES("nick_name", "#{nickName,jdbcType=VARCHAR}");
        }
        
        if (record.getTelphone() != null) {
            VALUES("telphone", "#{telphone,jdbcType=CHAR}");
        }
        
        if (record.getPhoneNumber() != null) {
            VALUES("phone_number", "#{phoneNumber,jdbcType=CHAR}");
        }
        
        if (record.getPhoto() != null) {
            VALUES("photo", "#{photo,jdbcType=VARCHAR}");
        }
        
        if (record.getCompany() != null) {
            VALUES("company", "#{company,jdbcType=VARCHAR}");
        }
        
        if (record.getLastLoginTime() != null) {
            VALUES("last_login_time", "#{lastLoginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getType() != null) {
            VALUES("type", "#{type,jdbcType=SMALLINT}");
        }
        
        if (record.getToken() != null) {
            VALUES("token", "#{token,jdbcType=VARCHAR}");
        }

        if (record.getCreateTime() != null) {
            VALUES("create_time", "#{createTime, jdbcType=TIMESTAMP}");
        }

        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ss_user
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(SsUser record) {
        BEGIN();
        UPDATE("ss_user");
        
        if (record.getUsern() != null) {
            SET("usern = #{usern,jdbcType=VARCHAR}");
        }
        
        if (record.getPassw() != null) {
            SET("passw = #{passw,jdbcType=VARCHAR}");
        }
        
        if (record.getNickName() != null) {
            SET("nick_name = #{nickName,jdbcType=VARCHAR}");
        }
        
        if (record.getTelphone() != null) {
            SET("telphone = #{telphone,jdbcType=CHAR}");
        }
        
        if (record.getPhoneNumber() != null) {
            SET("phone_number = #{phoneNumber,jdbcType=CHAR}");
        }
        
        if (record.getPhoto() != null) {
            SET("photo = #{photo,jdbcType=VARCHAR}");
        }
        
        if (record.getCompany() != null) {
            SET("company = #{company,jdbcType=VARCHAR}");
        }
        
        if (record.getLastLoginTime() != null) {
            SET("last_login_time = #{lastLoginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getType() != null) {
            SET("type = #{type,jdbcType=SMALLINT}");
        }
        
        if (record.getToken() != null) {
            SET("token = #{token,jdbcType=VARCHAR}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }
}