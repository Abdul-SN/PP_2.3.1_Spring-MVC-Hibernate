package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    List<User> index();

    User getById(int id);


    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int id);
}
