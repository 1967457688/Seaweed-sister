package com.luolight.SeaweedS.mappers;

import com.luolight.SeaweedS.models.SsUrl;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface SsUrlMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ss_url
     *
     * @mbggenerated
     */
    @Delete({
        "delete from ss_url",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ss_url
     *
     * @mbggenerated
     */
    @Insert({
        "insert into ss_url (id, name, ",
        "url_host, is_delete, ",
        "time)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{urlHost,jdbcType=VARCHAR}, #{isDelete,jdbcType=SMALLINT}, ",
        "#{time,jdbcType=TIMESTAMP})"
    })
    int insert(SsUrl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ss_url
     *
     * @mbggenerated
     */
    @InsertProvider(type=SsUrlSqlProvider.class, method="insertSelective")
    int insertSelective(SsUrl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ss_url
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, name, url_host, is_delete, time",
        "from ss_url",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="url_host", property="urlHost", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_delete", property="isDelete", jdbcType=JdbcType.SMALLINT),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP)
    })
    SsUrl selectByPrimaryKey(Integer id);
    
    @Select({
        "select",
        "id, name, url_host, is_delete, time",
        "from ss_url",
        "where url_host = #{urlHost,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="url_host", property="urlHost", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_delete", property="isDelete", jdbcType=JdbcType.SMALLINT),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP)
    })
    SsUrl selectByUrlHost(String urlHost);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ss_url
     *
     * @mbggenerated
     */
    @UpdateProvider(type=SsUrlSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SsUrl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ss_url
     *
     * @mbggenerated
     */
    @Update({
        "update ss_url",
        "set name = #{name,jdbcType=VARCHAR},",
          "url_host = #{urlHost,jdbcType=VARCHAR},",
          "is_delete = #{isDelete,jdbcType=SMALLINT},",
          "time = #{time,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SsUrl record);
}