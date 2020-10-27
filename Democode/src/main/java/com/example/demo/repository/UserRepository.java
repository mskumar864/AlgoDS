package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.Models.Address;
import com.example.demo.Models.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserRepository extends CrudRepository<User,Integer>
{

}
