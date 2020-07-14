package com.luolight.SeaweedS.mappers;

import com.luolight.SeaweedS.models.SsStructureLevel;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface SsStructureLevelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ss_structure_level
     *
     * @mbggenerated
     */
    @Delete({
        "delete from ss_structure_level",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ss_structure_level
     *
     * @mbggenerated
     */
    @Insert({
        "insert into ss_structure_level (id, content, ",
        "user_id, is_delete, ",
        "delete_time)",
        "values (#{id,jdbcType=INTEGER}, #{content,jdbcType=VARCHAR}, ",
        "#{userId,jdbcType=INTEGER}, #{isDelete,jdbcType=SMALLINT}, ",
        "#{deleteTime,jdbcType=TIMESTAMP})"
    })
    int insert(SsStructureLevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ss_structure_level
     *
     * @mbggenerated
     */
    @InsertProvider(type=SsStructureLevelSqlProvider.class, method="insertSelective")
    int insertSelective(SsStructureLevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ss_structure_level
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, content, user_id, is_delete, delete_time",
        "from ss_structure_level",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="is_delete", property="isDelete", jdbcType=JdbcType.SMALLINT),
        @Result(column="delete_time", property="deleteTime", jdbcType=JdbcType.TIMESTAMP)
    })
    SsStructureLevel selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ss_structure_level
     *
     * @mbggenerated
     */
    @UpdateProvider(type=SsStructureLevelSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SsStructureLevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ss_structure_level
     *
     * @mbggenerated
     */
    @Update({
        "update ss_structure_level",
        "set content = #{content,jdbcType=VARCHAR},",
          "user_id = #{userId,jdbcType=INTEGER},",
          "is_delete = #{isDelete,jdbcType=SMALLINT},",
          "delete_time = #{deleteTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SsStructureLevel record);
}