package com.cg.hsbc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.hsbc.dao.RoleDao;
import com.cg.hsbc.entity.Role;
import com.cg.hsbc.exceptions.RoleException;

@Service
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	private RoleDao roleDao;

	@Override
	public List<Role> getAllRoles() throws RoleException {
		
		return roleDao.findAll();
	}

	@Override
	public Role addRole( Role role) throws RoleException {
	
		try {
            // Check if role object is null
            if (role == null) {
                throw new RoleException("Failed to add role, role object is null");
            }

            // Check if roleName or roleDescription is null
            if (role.getRoleName() == null || role.getRoleDescription() == null) {
                throw new RoleException("Failed to add role, roleName or roleDescription is null");
            }

            // Save the role
            Role savedRole = roleDao.save(role);

            // Check if savedRole is null
            if (savedRole == null) {
                throw new RoleException("Failed to add role, saved role object is null");
            }

            // Check if roleId is null
            if (savedRole.getRoleId() == null) {
                throw new RoleException("Failed to add role, Role ID is null");
            }

            return savedRole;
        } catch (Exception e) {
            throw new RoleException("Failed to add Role: " + e.getMessage());
        }
		 
	}

	@Override
	public void deleteRole(Long roleId) throws RoleException {
		
		Optional<Role> roles=roleDao.findById(roleId);
		if(roles.isPresent()) {
			roleDao.deleteById(roleId);
		}
		else {
			throw new RoleException("Role not found with ID :-"+ roleId);
		}
		
		
		
		
	}

	@Override
	public Role updateRole(Role role) throws RoleException {
		
		if(role.getRoleId()== null) {
			throw new IllegalArgumentException("Role Id cannot be null for update");
		}
		Role existingRole=roleDao.findById(role.getRoleId())
				.orElseThrow(()-> new RoleException("Role with this ID not found")); 
				
		existingRole.setRoleName(role.getRoleName());
		existingRole.setRoleDescription(role.getRoleDescription());
		
		
		return roleDao.save(existingRole);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
