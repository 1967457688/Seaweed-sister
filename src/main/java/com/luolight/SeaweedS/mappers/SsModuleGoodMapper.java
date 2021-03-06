package com.luolight.SeaweedS.mappers;

import com.luolight.SeaweedS.models.SsModuleGood;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface SsModuleGoodMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ss_module_good
     *
     * @mbggenerated
     */
    @Delete({
        "delete from ss_module_good",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ss_module_good
     *
     * @mbggenerated
     */
    @Insert({
        "insert into ss_module_good (id, module_article_id, ",
        "user_id, header_pic, ",
        "time, is_read, ",
        "is_delete, operation_time, ",
        "type)",
        "values (#{id,jdbcType=INTEGER}, #{moduleArticleId,jdbcType=INTEGER}, ",
        "#{userId,jdbcType=INTEGER}, #{headerPic,jdbcType=VARCHAR}, ",
        "#{time,jdbcType=TIMESTAMP}, #{isRead,jdbcType=SMALLINT}, ",
        "#{isDelete,jdbcType=SMALLINT}, #{operationTime,jdbcType=TIMESTAMP}, ",
        "#{type,jdbcType=SMALLINT})"
    })
    int insert(SsModuleGood record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ss_module_good
     *
     * @mbggenerated
     */
    @InsertProvider(type=SsModuleGoodSqlProvider.class, method="insertSelective")
    int insertSelective(SsModuleGood record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ss_module_good
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, module_article_id, user_id, header_pic, time, is_read, is_delete, operation_time, ",
        "type",
        "from ss_module_good",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="module_article_id", property="moduleArticleId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="header_pic", property="headerPic", jdbcType=JdbcType.VARCHAR),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="is_read", property="isRead", jdbcType=JdbcType.SMALLINT),
        @Result(column="is_delete", property="isDelete", jdbcType=JdbcType.SMALLINT),
        @Result(column="operation_time", property="operationTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="type", property="type", jdbcType=JdbcType.SMALLINT)
    })
    SsModuleGood selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ss_module_good
     *
     * @mbggenerated
     */
    @UpdateProvider(type=SsModuleGoodSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SsModuleGood record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ss_module_good
     *
     * @mbggenerated
     */
    @Update({
        "update ss_module_good",
        "set module_article_id = #{moduleArticleId,jdbcType=INTEGER},",
          "user_id = #{userId,jdbcType=INTEGER},",
          "header_pic = #{headerPic,jdbcType=VARCHAR},",
          "time = #{time,jdbcType=TIMESTAMP},",
          "is_read = #{isRead,jdbcType=SMALLINT},",
          "is_delete = #{isDelete,jdbcType=SMALLINT},",
          "operation_time = #{operationTime,jdbcType=TIMESTAMP},",
          "type = #{type,jdbcType=SMALLINT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SsModuleGood record);
}