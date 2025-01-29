package com.user_management_system.user_management_system.controller;

import com.user_management_system.user_management_system.model.user;
import com.user_management_system.user_management_system.service.userServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/user")
public class userController {


    @Autowired
    private userServiceImpl userServiceimpl;

    @PostMapping("/save")
    public ResponseEntity<?> saveUser(@RequestBody user user){
        user savedUser = userServiceimpl.saveUser(user);
        if (ObjectUtils.isEmpty(savedUser)){
            return new ResponseEntity<>("user not saved ", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>("user saved successfully to database ", HttpStatus.CREATED);
    }


    @GetMapping("/getusers")
    public ResponseEntity<?> getAllUser (){
        List<user> allUser = userServiceimpl.getAllUser();

        if (ObjectUtils.isEmpty(allUser)){
            return new ResponseEntity<>("no user present ", HttpStatus.INTERNAL_SERVER_ERROR);
        }else{
            return new ResponseEntity<>(allUser,HttpStatus.OK);
        }

    }

    @PutMapping("update/{id}")
    public ResponseEntity<?> updateUser(@RequestBody user user, @PathVariable Integer id){
        com.user_management_system.user_management_system.model.user savedUser = userServiceimpl.updateUser(id,user);
        if (ObjectUtils.isEmpty(savedUser)){
            return new ResponseEntity<>("user not updated ", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        else{
            return new ResponseEntity<>("user updated  successfully to database ", HttpStatus.CREATED);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser (@PathVariable Integer id){
        String allUser = userServiceimpl.deleteUser(id);

        if (ObjectUtils.isEmpty(allUser)){
            return new ResponseEntity<>("no user present ", HttpStatus.INTERNAL_SERVER_ERROR);
        }else{
            return new ResponseEntity<>(allUser,HttpStatus.OK);
        }

    }


    @GetMapping("/{id}")
    public ResponseEntity<?> getById (@PathVariable Integer id){
        user allUser = userServiceimpl.findUserById(id);

        if (ObjectUtils.isEmpty(allUser)){
            return new ResponseEntity<>("user not found ", HttpStatus.INTERNAL_SERVER_ERROR);
        }else{
            return new ResponseEntity<>(allUser,HttpStatus.OK);
        }

    }

}
