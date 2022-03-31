package com.example.jwtsecuritytest.repository;

import com.example.jwtsecuritytest.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select u from User u where u.email = ?1")
    User findByEmail(String email);
}
//public interface UserRepository extends CrudRepository<User, Integer> {
//
//    User findByEmail(String email);
//
//}
