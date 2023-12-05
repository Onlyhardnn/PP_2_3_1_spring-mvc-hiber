package web_hiber.service;

import web_hiber.model.User;

import java.util.List;

public interface UserService {

    void add(User user);

    void update(User user);

    void delete(Long id);

    List<User> getAllUsers();

}
