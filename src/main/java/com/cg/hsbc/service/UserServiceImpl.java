package com.cg.hsbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hsbc.dao.UserDao;
import com.cg.hsbc.entity.User;
import com.cg.hsbc.exceptions.UserException;

@Service("UserService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public List<User> getAllUsers() throws UserException {
		
		return userDao.findAll();
	}

	@Override
	public User addUser(User user) throws UserException {
		userDao.saveAndFlush(user);
		return user;
	}

	@Override
	public User deleteUser(User user) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(User user) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findById(Long userId) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByUsername(String username) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByEmail(String userEmail) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void changePassword(Long userId, String newPassword) throws UserException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateLastlogin(Long userId) throws UserException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resetPassword(String userEmail) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void activateAccount(Long userId) throws UserException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deactivateAccount(Long userId) throws UserException {
		// TODO Auto-generated method stub
		
	}



	
	
}
