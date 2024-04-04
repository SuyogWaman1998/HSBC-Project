package com.cg.hsbc.service;

import java.util.List;

import com.cg.hsbc.entity.Role;
import com.cg.hsbc.exceptions.RoleException;


public interface RoleService {

	List<Role> getAllRoles() throws RoleException;
	  Role addRole(Role role)throws RoleException;
	   void deleteRole(Long roleId)throws RoleException;
	  Role updateRole(Role role)throws RoleException;
}
