package web_hiber.dao;

import web_hiber.model.User;

import java.util.List;

// CRUD методы по ТЗ
public interface UserDao {

    void add(User user);

    void update(User user);

    void delete(Long id);

    List<User> getAllUsers();

}

