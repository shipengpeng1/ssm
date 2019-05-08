package com.ssm.service;

import com.ssm.model.User;


public interface IUserService {

    User selectUser(long userId);

    int insert(User user);
    
    User login(String name,String passwd);
    
    int register(User user);

}
