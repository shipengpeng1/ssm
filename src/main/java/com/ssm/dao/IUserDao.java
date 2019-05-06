package com.ssm.dao;
import org.apache.ibatis.annotations.Param;

import com.ssm.model.User;
public interface IUserDao {
    User selectUser(long id);
    User login(@Param("userName")String userName ,@Param("passwd")String passwd);
}