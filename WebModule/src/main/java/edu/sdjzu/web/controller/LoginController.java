package edu.sdjzu.web.controller;

import edu.sdjzu.database.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    private final UserService userService;

    @Autowired
    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("loginCheck")
    public boolean loginCheck(String username, String password){
        return userService.loginCheck(username, password);
    }
}
