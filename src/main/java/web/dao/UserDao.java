package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    public void saveUser(User user);

    User getUserById(int id);

    public void updateUser(int id, User user);

    public void deleteUser(int id);
}
