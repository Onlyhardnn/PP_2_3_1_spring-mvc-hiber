package web_hiber.dao;

import web_hiber.model.User;

import java.util.List;

/**
 * Интерфейс для взаимодействия с данными пользователя.
 * Определяет основные операции CRUD (create, read, update, delete).
 */
public interface UserDao {

    void add(User user);

    void update(User user);

    void delete(Long id);

    List<User> getAllUsers();

}

