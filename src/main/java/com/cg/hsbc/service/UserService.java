package com.cg.hsbc.service;

import java.util.List;

import com.cg.hsbc.entity.User;
import com.cg.hsbc.exceptions.UserException;

  public interface UserService {

	
	  User addUser(User user)throws UserException;
	  User deleteUser(User user)throws UserException;
	  User updateUser(User user)throws UserException;
	  User findById(Long userId)throws UserException;
	  User findByUsername(String username)throws UserException;
	  User findByEmail(String userEmail)throws UserException;
	  void changePassword(Long userId,String newPassword ) throws UserException;
	  void updateLastlogin(Long userId) throws UserException;
	  void resetPassword(String userEmail);
	  void activateAccount(Long userId) throws UserException;
	  void deactivateAccount(Long userId) throws UserException;
	List<User> getAllUsers() throws UserException;
	 
}
