package com.ssm.service.impl;

import com.ssm.dao.IUserDao;
import com.ssm.model.User;
import com.ssm.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }

    @Override
    public int insert(User user) {
        return 0;
    }

	@Override
	public User login(String name, String passwd) {
		//System.out.println("DAO"+name+passwd);
		User u=userDao.login(name, passwd);
		return u;
	}

	@Override
	public int register(User user) {
		// TODO Auto-generated method stub
		int i=userDao.register(user);
		return i;
	}


}
