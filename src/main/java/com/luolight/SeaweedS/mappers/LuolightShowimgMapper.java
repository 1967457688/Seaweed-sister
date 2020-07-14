package com.luolight.SeaweedS.mappers;

import com.luolight.SeaweedS.models.LuolightShowimg;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface LuolightShowimgMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table luolight_showimg
     *
     * @mbggenerated
     */
    @Delete({
        "delete from luolight_showimg",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table luolight_showimg
     *
     * @mbggenerated
     */
    @Insert({
        "insert into luolight_showimg (id, image_url, ",
        "title, desc, linked, ",
        "more, frompage, ",
        "position)",
        "values (#{id,jdbcType=INTEGER}, #{imageUrl,jdbcType=VARCHAR}, ",
        "#{title,jdbcType=VARCHAR}, #{desc,jdbcType=VARCHAR}, #{linked,jdbcType=VARCHAR}, ",
        "#{more,jdbcType=VARCHAR}, #{frompage,jdbcType=VARCHAR}, ",
        "#{position,jdbcType=VARCHAR})"
    })
    int insert(LuolightShowimg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table luolight_showimg
     *
     * @mbggenerated
     */
    @InsertProvider(type=LuolightShowimgSqlProvider.class, method="insertSelective")
    int insertSelective(LuolightShowimg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table luolight_showimg
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, image_url, title, desc, linked, more, frompage, position",
        "from luolight_showimg",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="image_url", property="imageUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="desc", property="desc", jdbcType=JdbcType.VARCHAR),
        @Result(column="linked", property="linked", jdbcType=JdbcType.VARCHAR),
        @Result(column="more", property="more", jdbcType=JdbcType.VARCHAR),
        @Result(column="frompage", property="frompage", jdbcType=JdbcType.VARCHAR),
        @Result(column="position", property="position", jdbcType=JdbcType.VARCHAR)
    })
    LuolightShowimg selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table luolight_showimg
     *
     * @mbggenerated
     */
    @UpdateProvider(type=LuolightShowimgSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LuolightShowimg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table luolight_showimg
     *
     * @mbggenerated
     */
    @Update({
        "update luolight_showimg",
        "set image_url = #{imageUrl,jdbcType=VARCHAR},",
          "title = #{title,jdbcType=VARCHAR},",
          "desc = #{desc,jdbcType=VARCHAR},",
          "linked = #{linked,jdbcType=VARCHAR},",
          "more = #{more,jdbcType=VARCHAR},",
          "frompage = #{frompage,jdbcType=VARCHAR},",
          "position = #{position,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LuolightShowimg record);
}