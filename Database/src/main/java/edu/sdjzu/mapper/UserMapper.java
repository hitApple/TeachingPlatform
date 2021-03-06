package edu.sdjzu.mapper;

import edu.sdjzu.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> getAllUsers();

    User getUserById(String id);

    void deleteUserById(String id);

    void insertUser(User user);

    void updateUser(User user);

}