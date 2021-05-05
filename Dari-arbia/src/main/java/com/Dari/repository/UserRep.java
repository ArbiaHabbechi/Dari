package com.Dari.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Dari.entities.User;



@Repository
public interface UserRep extends CrudRepository<User, Long> {

}
