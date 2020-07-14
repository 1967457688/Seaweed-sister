package com.luolight.SeaweedS.mappers;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.luolight.SeaweedS.models.SsModuleWo;

public class SsModuleWoSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ss_module_wo
     *
     * @mbggenerated
     */
    public String insertSelective(SsModuleWo record) {
        BEGIN();
        INSERT_INTO("ss_module_wo");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getModuleId() != null) {
            VALUES("module_id", "#{moduleId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getType() != null) {
            VALUES("type", "#{type,jdbcType=SMALLINT}");
        }
        
        if (record.getDescription() != null) {
            VALUES("description", "#{description,jdbcType=VARCHAR}");
        }
        
        if (record.getPic() != null) {
            VALUES("pic", "#{pic,jdbcType=VARCHAR}");
        }
        
        if (record.getTime() != null) {
            VALUES("time", "#{time,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOperationLevel() != null) {
            VALUES("operation_level", "#{operationLevel,jdbcType=SMALLINT}");
        }
        
        if (record.getStatus() != null) {
            VALUES("status", "#{status,jdbcType=SMALLINT}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ss_module_wo
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(SsModuleWo record) {
        BEGIN();
        UPDATE("ss_module_wo");
        
        if (record.getModuleId() != null) {
            SET("module_id = #{moduleId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getType() != null) {
            SET("type = #{type,jdbcType=SMALLINT}");
        }
        
        if (record.getDescription() != null) {
            SET("description = #{description,jdbcType=VARCHAR}");
        }
        
        if (record.getPic() != null) {
            SET("pic = #{pic,jdbcType=VARCHAR}");
        }
        
        if (record.getTime() != null) {
            SET("time = #{time,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOperationLevel() != null) {
            SET("operation_level = #{operationLevel,jdbcType=SMALLINT}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{status,jdbcType=SMALLINT}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }
}