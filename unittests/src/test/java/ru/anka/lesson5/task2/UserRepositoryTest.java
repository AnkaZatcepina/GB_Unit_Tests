package ru.anka.lesson5.task2;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class UserRepositoryTest {
    UserRepository userRepository = new FakeUserRepository();
    UserService userService = new UserService(userRepository);

    @Test
    public void getUserFullName(){
        String result = userService.getUserFullName(1);
        String expected = "FirstName LastName";
        assertEquals(expected,result);
    }

    @Test
    public void getUserFullName2(){
        String result = userService.getUserFullName(10);
        String expected = "User not found";
        assertEquals(expected,result);
    }

    // Фиктивная реализация UserRepository для тестов
    private static class FakeUserRepository extends UserRepository {

        public User getUserById(int id){
            User user = new User(1, "FirstName", "LastName");
            if (id == 1){
                return user;
            }
            else {
                return null;
            }
        }
    }

}
