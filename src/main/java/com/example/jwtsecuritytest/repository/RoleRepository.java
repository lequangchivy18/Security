package com.example.jwtsecuritytest.repository;

import com.example.jwtsecuritytest.domain.Role;
import com.example.jwtsecuritytest.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface RoleRepository extends JpaRepository<Role, Long> {
    @Query("select u from Role u where u.name = ?1")
    Role findByName(String name);
}
//public interface RoleRepository extends CrudRepository<Role, Integer> {
//
//    Role findByName(String name);
//
//}
