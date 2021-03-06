package com.cduestc.keep.mapper;

import com.cduestc.keep.model.Post;
import com.cduestc.keep.model.PostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table keep_post
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    long countByExample(PostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table keep_post
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    int deleteByExample(PostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table keep_post
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    int deleteByPrimaryKey(Long postId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table keep_post
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    int insert(Post record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table keep_post
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    int insertSelective(Post record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table keep_post
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    List<Post> selectByExample(PostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table keep_post
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    Post selectByPrimaryKey(Long postId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table keep_post
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    int updateByExampleSelective(@Param("record") Post record, @Param("example") PostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table keep_post
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    int updateByExample(@Param("record") Post record, @Param("example") PostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table keep_post
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    int updateByPrimaryKeySelective(Post record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table keep_post
     *
     * @mbg.generated Sat Feb 15 21:07:37 CST 2020
     */
    int updateByPrimaryKey(Post record);
}