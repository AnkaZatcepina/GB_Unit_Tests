package ru.anka.lesson5.task2;

import java.util.List;

public class UserRepository {
    // Предположим, что здесь есть методы для доступа к данным пользователей.
    // Например, метод getUserById(int userId) для получения пользователя по ID.

    List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public User getUserById(int id){
        return null;
    }
}
