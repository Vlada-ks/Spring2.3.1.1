package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    public void saveUser(User user);

    User getUserById(int id);

    public void updateUser(int id, User user);

    public void deleteUser(int id);
}
