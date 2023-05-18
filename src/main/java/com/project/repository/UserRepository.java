package com.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.model.User;
import com.mysql.cj.jdbc.Driver;

public interface UserRepository extends CrudRepository<User,Integer> {

}
