package com.qinfenfeng.roadmeets.mbg.mapper;

import com.qinfenfeng.roadmeets.mbg.model.UserInfo;
import com.qinfenfeng.roadmeets.mbg.model.UserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Mon Jan 13 15:22:13 CST 2020
     */
    int countByExample(UserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Mon Jan 13 15:22:13 CST 2020
     */
    int deleteByExample(UserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Mon Jan 13 15:22:13 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Mon Jan 13 15:22:13 CST 2020
     */
    int insert(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Mon Jan 13 15:22:13 CST 2020
     */
    int insertSelective(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Mon Jan 13 15:22:13 CST 2020
     */
    List<UserInfo> selectByExample(UserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Mon Jan 13 15:22:13 CST 2020
     */
    UserInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Mon Jan 13 15:22:13 CST 2020
     */
    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Mon Jan 13 15:22:13 CST 2020
     */
    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Mon Jan 13 15:22:13 CST 2020
     */
    int updateByPrimaryKeySelective(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Mon Jan 13 15:22:13 CST 2020
     */
    int updateByPrimaryKey(UserInfo record);
}