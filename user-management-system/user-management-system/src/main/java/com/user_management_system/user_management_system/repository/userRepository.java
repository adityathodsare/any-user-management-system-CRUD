package com.user_management_system.user_management_system.repository;

import com.user_management_system.user_management_system.model.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface userRepository extends JpaRepository<user,Integer> {


    /*
    save(User entity): Saves or updates a User entity.
    findById(Integer id): Retrieves a User by its ID.
    findAll(): Retrieves all User entities.
    deleteById(Integer id): Deletes a User by its ID.
    count(): Returns the total number of User entities
     */

}
