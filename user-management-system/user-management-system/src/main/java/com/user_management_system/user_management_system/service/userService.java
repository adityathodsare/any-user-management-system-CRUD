package com.user_management_system.user_management_system.service;

import com.user_management_system.user_management_system.model.user;

import java.util.List;

public interface userService {

    public user saveUser(user user);

    public List<user> getAllUser();

    public  user updateUser(Integer id, user user );

    public String  deleteUser(Integer id );

    public user findUserById(Integer id);




}
