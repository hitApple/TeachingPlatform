package edu.sdjzu.mapper;

import edu.sdjzu.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserInfoMapper {

    List<UserInfo> getAllUserInfos();

    UserInfo getUserInfoById(String id);

    void deleteUserInfoById(String id);

    void insertUserInfo(UserInfo userInfo);

    void updateUserInfo(UserInfo userInfo);

}