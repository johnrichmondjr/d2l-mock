package edu.depaul.cdm.se452.d2l_mock.user;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;



public interface UserRoleRepository extends CrudRepository<UserRole, Integer>{
    Optional<UserRole> findByAuthority(String authority);
}