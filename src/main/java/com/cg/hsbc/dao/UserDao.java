package com.cg.hsbc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hsbc.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Long>{



}
