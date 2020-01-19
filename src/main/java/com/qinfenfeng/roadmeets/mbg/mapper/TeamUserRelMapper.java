package com.qinfenfeng.roadmeets.mbg.mapper;

import com.qinfenfeng.roadmeets.mbg.model.TeamUserRel;
import com.qinfenfeng.roadmeets.mbg.model.TeamUserRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamUserRelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team_user_rel
     *
     * @mbggenerated Mon Jan 13 15:22:13 CST 2020
     */
    int countByExample(TeamUserRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team_user_rel
     *
     * @mbggenerated Mon Jan 13 15:22:13 CST 2020
     */
    int deleteByExample(TeamUserRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team_user_rel
     *
     * @mbggenerated Mon Jan 13 15:22:13 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team_user_rel
     *
     * @mbggenerated Mon Jan 13 15:22:13 CST 2020
     */
    int insert(TeamUserRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team_user_rel
     *
     * @mbggenerated Mon Jan 13 15:22:13 CST 2020
     */
    int insertSelective(TeamUserRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team_user_rel
     *
     * @mbggenerated Mon Jan 13 15:22:13 CST 2020
     */
    List<TeamUserRel> selectByExample(TeamUserRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team_user_rel
     *
     * @mbggenerated Mon Jan 13 15:22:13 CST 2020
     */
    TeamUserRel selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team_user_rel
     *
     * @mbggenerated Mon Jan 13 15:22:13 CST 2020
     */
    int updateByExampleSelective(@Param("record") TeamUserRel record, @Param("example") TeamUserRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team_user_rel
     *
     * @mbggenerated Mon Jan 13 15:22:13 CST 2020
     */
    int updateByExample(@Param("record") TeamUserRel record, @Param("example") TeamUserRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team_user_rel
     *
     * @mbggenerated Mon Jan 13 15:22:13 CST 2020
     */
    int updateByPrimaryKeySelective(TeamUserRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team_user_rel
     *
     * @mbggenerated Mon Jan 13 15:22:13 CST 2020
     */
    int updateByPrimaryKey(TeamUserRel record);
}