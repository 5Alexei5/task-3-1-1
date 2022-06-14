package ru.tereshin.pp_3_1_1_springboot.service;



import ru.tereshin.pp_3_1_1_springboot.model.User;

public interface UserService {

    Iterable<User> getAllUsers();

    void addUser(User user);

    void update(User user, long id);

    User getUser(long id);

    void deleteUser(long id);
}
