package edu.sdjzu.database.controller.database;

import edu.sdjzu.database.Service.UserInfoService;
import edu.sdjzu.database.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("database/userInfo")
public class UserInfoController {

    private final UserInfoService userInfoService;

    @Autowired
    public UserInfoController(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    @RequestMapping("queryById")
    public UserInfo queryById(String id){
        return userInfoService.getUserInfoById(id);
    }

    @RequestMapping("queryAll")
    public List<UserInfo> queryAll(){
        return userInfoService.getAllUserInfos();
    }

    @RequestMapping("delete")
    public String delete(String id){
        userInfoService.deleteUserInfoById(id);
        return "Operation successful!";
    }

    @RequestMapping("insert")
    public String insert(UserInfo userInfo){
        userInfoService.insertUserInfo(userInfo);
        return "Operation successful!";
    }

    @RequestMapping("update")
    public String update(UserInfo userInfo){
        userInfoService.updateUserInfo(userInfo);
        return "Operation successful!";
    }
}
