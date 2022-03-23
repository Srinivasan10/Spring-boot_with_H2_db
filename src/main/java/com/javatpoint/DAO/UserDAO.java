package com.javatpoint.DAO;

import org.springframework.data.repository.CrudRepository;

import com.javatpoint.model.User;

public interface UserDAO extends CrudRepository<User, Integer> {

}
