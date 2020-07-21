package com.sqldemo.demo.Repo;

import org.springframework.data.repository.CrudRepository;

import com.sqldemo.demo.Model.User;

public interface UserRepo extends CrudRepository<User, Integer> {

}