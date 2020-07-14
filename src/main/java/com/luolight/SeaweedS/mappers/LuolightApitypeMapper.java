package com.luolight.SeaweedS.mappers;

import com.luolight.SeaweedS.models.LuolightApitype;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface LuolightApitypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table luolight_apitype
     *
     * @mbggenerated
     */
    @Delete({
        "delete from luolight_apitype",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table luolight_apitype
     *
     * @mbggenerated
     */
    @Insert({
        "insert into luolight_apitype (id, name, ",
        "desc, cla)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{desc,jdbcType=VARCHAR}, #{cla,jdbcType=VARCHAR})"
    })
    int insert(LuolightApitype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table luolight_apitype
     *
     * @mbggenerated
     */
    @InsertProvider(type=LuolightApitypeSqlProvider.class, method="insertSelective")
    int insertSelective(LuolightApitype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table luolight_apitype
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, name, desc, cla",
        "from luolight_apitype",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="desc", property="desc", jdbcType=JdbcType.VARCHAR),
        @Result(column="cla", property="cla", jdbcType=JdbcType.VARCHAR)
    })
    LuolightApitype selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table luolight_apitype
     *
     * @mbggenerated
     */
    @UpdateProvider(type=LuolightApitypeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LuolightApitype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table luolight_apitype
     *
     * @mbggenerated
     */
    @Update({
        "update luolight_apitype",
        "set name = #{name,jdbcType=VARCHAR},",
          "desc = #{desc,jdbcType=VARCHAR},",
          "cla = #{cla,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LuolightApitype record);
}