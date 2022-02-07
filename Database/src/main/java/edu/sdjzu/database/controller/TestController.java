package edu.sdjzu.database.controller;

import edu.sdjzu.database.Service.impl.UserServiceImpl;
import edu.sdjzu.database.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    private UserServiceImpl userService;

    @Autowired
    public TestController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @RequestMapping("getAll")
    public List<User> getAll(){
        return userService.getAllUsers();
    }

    @RequestMapping("getUser")
    public User getUser(String id){
        return userService.getUserById(id);
    }

    @RequestMapping("deleteUser")
    public void deleteUser(String id){
        userService.deleteUserById(id);
    }

    @RequestMapping("updateUser")
    public void updateUser(User user){
        userService.updateUser(user);
    }

    @RequestMapping("insertUser")
    public void insertUser(){
        User user = new User();
        user.setId("006");
        user.setUsername("test");
        user.setPassword("test");
        user.setRole("test");
        userService.insertUser(user);
    }
}
