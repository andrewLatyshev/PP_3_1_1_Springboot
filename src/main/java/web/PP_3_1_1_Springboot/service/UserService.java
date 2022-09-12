package web.PP_3_1_1_Springboot.service;

import web.PP_3_1_1_Springboot.models.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void saveUser(User user);

    void removeUserById(int id);

    void editUser(int id, User user);

    User showUser(int id);
}
