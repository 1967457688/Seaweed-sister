package com.luolight.SeaweedS.mappers;

import com.luolight.SeaweedS.models.SsModuleArticle;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface SsModuleArticleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ss_module_article
     *
     * @mbggenerated
     */
    @Delete({
        "delete from ss_module_article",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ss_module_article
     *
     * @mbggenerated
     */
    @Insert({
        "insert into ss_module_article (id, user_id, ",
        "type, content, ",
        "picture, video, ",
        "time, is_delete, ",
        "operation_time, module_id)",
        "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{type,jdbcType=SMALLINT}, #{content,jdbcType=VARCHAR}, ",
        "#{picture,jdbcType=VARCHAR}, #{video,jdbcType=VARCHAR}, ",
        "#{time,jdbcType=TIMESTAMP}, #{isDelete,jdbcType=SMALLINT}, ",
        "#{operationTime,jdbcType=TIMESTAMP}, #{moduleId,jdbcType=INTEGER})"
    })
    int insert(SsModuleArticle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ss_module_article
     *
     * @mbggenerated
     */
    @InsertProvider(type=SsModuleArticleSqlProvider.class, method="insertSelective")
    int insertSelective(SsModuleArticle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ss_module_article
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, user_id, type, content, picture, video, time, is_delete, operation_time, ",
        "module_id",
        "from ss_module_article",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.SMALLINT),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="picture", property="picture", jdbcType=JdbcType.VARCHAR),
        @Result(column="video", property="video", jdbcType=JdbcType.VARCHAR),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="is_delete", property="isDelete", jdbcType=JdbcType.SMALLINT),
        @Result(column="operation_time", property="operationTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="module_id", property="moduleId", jdbcType=JdbcType.INTEGER)
    })
    SsModuleArticle selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ss_module_article
     *
     * @mbggenerated
     */
    @UpdateProvider(type=SsModuleArticleSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SsModuleArticle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ss_module_article
     *
     * @mbggenerated
     */
    @Update({
        "update ss_module_article",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "type = #{type,jdbcType=SMALLINT},",
          "content = #{content,jdbcType=VARCHAR},",
          "picture = #{picture,jdbcType=VARCHAR},",
          "video = #{video,jdbcType=VARCHAR},",
          "time = #{time,jdbcType=TIMESTAMP},",
          "is_delete = #{isDelete,jdbcType=SMALLINT},",
          "operation_time = #{operationTime,jdbcType=TIMESTAMP},",
          "module_id = #{moduleId,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SsModuleArticle record);
}