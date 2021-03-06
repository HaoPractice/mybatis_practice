package com.sf.dao;

import com.sf.model.User;
import com.sf.model.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_1
     *
     * @mbg.generated Tue Jan 03 23:33:05 CST 2017
     */
    long countByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_1
     *
     * @mbg.generated Tue Jan 03 23:33:05 CST 2017
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_1
     *
     * @mbg.generated Tue Jan 03 23:33:05 CST 2017
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_1
     *
     * @mbg.generated Tue Jan 03 23:33:05 CST 2017
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_1
     *
     * @mbg.generated Tue Jan 03 23:33:05 CST 2017
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_1
     *
     * @mbg.generated Tue Jan 03 23:33:05 CST 2017
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_1
     *
     * @mbg.generated Tue Jan 03 23:33:05 CST 2017
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);
}