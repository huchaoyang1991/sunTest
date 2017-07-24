package com.sun.service.impl;

import com.sun.dao.UserDao;
import com.sun.dto.User;
import com.sun.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/7/15.
 */
@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;
	@Override
	public void getUserInfo(int id) {
		User user=userDao.selectUserById(id);
		System.out.println(user);
	}
}
