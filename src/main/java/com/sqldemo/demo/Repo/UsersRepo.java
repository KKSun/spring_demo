package com.sqldemo.demo.Repo;

import org.springframework.data.repository.CrudRepository;

import com.sqldemo.demo.Model.Users;

public interface UsersRepo extends CrudRepository<Users, Integer> {

}