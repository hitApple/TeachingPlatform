package edu.sdjzu.database.Service;

import edu.sdjzu.database.model.UserInfo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface UserInfoService {

    List<UserInfo> getAllUserInfos();

    UserInfo getUserInfoById(String id);

    void deleteUserInfoById(String id);

    void insertUserInfo(UserInfo userInfo);

    void updateUserInfo(UserInfo userInfo);


}
