package com.user_management_system.user_management_system.service;

import com.user_management_system.user_management_system.model.user;
import com.user_management_system.user_management_system.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class userServiceImpl implements userService{


//     private final  //userRepository //userRepository;
//
//    @Autowired
//    public userServiceImpl(com.user_management_system.user_management_system.repository.userRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    @Autowired
    private  userRepository userRepository;

    @Override
    public user saveUser(user user) {
        return userRepository.save(user);
    }

    @Override
    public List<user> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public user updateUser(Integer id, user user) {
        if(!userRepository.findById(id).isPresent() ){
            System.out.println(" id not found so creating new user ");
        }
            return userRepository.save(user);

    }

    @Override
    public String   deleteUser(Integer id ) {
      if(userRepository.findById(id).isPresent() ){
          user user = userRepository.findById(id).get();
          userRepository.delete(user);
          return " user deleted successfully ";
      }
      else {
          return "cannot find id give valid user Id ";
      }
    }

    @Override
    public user findUserById(Integer id) {
        Optional<user> userById  = userRepository.findById(id);
        if (userById.isPresent()){
            return userById.get();
        }
        return  null;

    }
}
