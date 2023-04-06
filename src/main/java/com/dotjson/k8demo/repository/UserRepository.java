package com.dotjson.k8demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dotjson.k8demo.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
    

}
