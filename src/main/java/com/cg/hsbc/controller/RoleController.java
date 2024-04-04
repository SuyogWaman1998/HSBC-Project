package com.cg.hsbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.hsbc.entity.Role;
import com.cg.hsbc.exceptions.RoleException;
import com.cg.hsbc.service.RoleService;

@RestController
@RequestMapping("/hsbc-roles")
public class RoleController {

	@Autowired
	private RoleService roleService;
	
	@GetMapping("/roles")
	public List<Role> getAllRoles() throws RoleException {
		return roleService.getAllRoles();
	}
	
	@PostMapping("/addRole")
	public Role addRole(@RequestBody Role role) throws RoleException{
		
		return roleService.addRole(role);	
	}
	
	@PutMapping("/updateRole")
	public Role updateRole(@RequestBody Role role) throws RoleException{
		return roleService.updateRole(role);
	}
	
	@DeleteMapping("/deleteRole")
	public void deleteRole( @RequestParam Long roleId) throws RoleException{
		
		roleService.deleteRole(roleId);
		
	}
	
	
}
