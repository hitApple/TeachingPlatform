package edu.sdjzu.Service.impl;

import edu.sdjzu.Service.UserInfoService;
import edu.sdjzu.mapper.UserInfoMapper;
import edu.sdjzu.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    private final UserInfoMapper userInfoMapper;

    @Autowired
    public UserInfoServiceImpl(UserInfoMapper userInfoMapper) {
        this.userInfoMapper = userInfoMapper;
    }

    @Override
    public List<UserInfo> getAllUserInfos() {
        return userInfoMapper.getAllUserInfos();
    }

    @Override
    public UserInfo getUserInfoById(String id) {
        return userInfoMapper.getUserInfoById(id);
    }

    @Override
    public void deleteUserInfoById(String id) {
        userInfoMapper.deleteUserInfoById(id);
    }

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        userInfoMapper.insertUserInfo(userInfo);
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        userInfoMapper.updateUserInfo(userInfo);
    }


}
