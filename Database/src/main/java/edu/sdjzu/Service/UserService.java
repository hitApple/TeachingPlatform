package edu.sdjzu.Service;

import edu.sdjzu.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface UserService {

    List<User> getAllUsers();

    User getUserById(String id);

    void deleteUserById(String id);

    void insertUser(User user);

    void updateUser(User user);


}
