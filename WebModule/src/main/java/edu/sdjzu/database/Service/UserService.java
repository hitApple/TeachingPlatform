package edu.sdjzu.database.Service;

import edu.sdjzu.database.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface UserService {

    List<User> getAllUsers();

    User getUserById(String id);

    void deleteUserById(String id);

    void insertUser(User user);

    void updateUser(User user);

    User getUserByUserName(String username);

    boolean loginCheck(String username, String password);

}
