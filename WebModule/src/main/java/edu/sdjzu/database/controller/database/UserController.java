package edu.sdjzu.database.controller.database;

import edu.sdjzu.database.Service.UserService;
import edu.sdjzu.database.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("database/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("queryById")
    public User queryById(String id){
        return userService.getUserById(id);
    }

    @RequestMapping("queryAll")
    public List<User> queryAll(){
        return userService.getAllUsers();
    }

    @RequestMapping("delete")
    public String delete(String id){
        userService.deleteUserById(id);
        return "Operation successful!";
    }

    @RequestMapping("insert")
    public String insert(User user){
        userService.insertUser(user);
        return "Operation successful!";
    }

    @RequestMapping("update")
    public String update(User user){
        userService.updateUser(user);
        return "Operation successful!";
    }
}
