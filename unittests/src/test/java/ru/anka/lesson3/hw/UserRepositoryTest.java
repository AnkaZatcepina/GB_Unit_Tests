package ru.anka.lesson3.hw;

/*
 Добавьте функцию в класс UserRepository, которая разлогинивает всех пользователей, кроме администраторов. Для этого, вам потребуется расширить класс User новым свойством, указывающим, обладает ли пользователь админскими правами. 
 Протестируйте данную функцию.
 */
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;


public class UserRepositoryTest {
    private UserRepository userRepository;
    private User user1;
    private User user2;
    private User admin1;
    private User admin2;

    @BeforeEach
    void setUp() {
        user1 = new User("John", "123", false);
        user2 = new User("Mike", "123", false);
        admin1 = new User("Kate", "123", true);
        admin2 = new User("Peter", "123", true);
        userRepository = new UserRepository();
    }

    @AfterEach
    void tearDown() {
        user1 = null;
        user2 = null;
        admin1 = null;
        admin2 = null;
        userRepository = null;
    }

    @Test
    @DisplayName("Проверка сохранения продуктов в Store.inventory")
    void TestUnlogUsers() {
        userRepository.addUser(user1);
        user1.authenticate("John", "123");
        userRepository.addUser(user2);
        user2.authenticate("Mike", "123");
        userRepository.addUser(admin1);
        admin1.authenticate("Kate", "123");
        userRepository.addUser(admin2);
        admin2.authenticate("Peter", "123");

        userRepository.unlogUsers();
        int countLogged = 0;
        for (User user : userRepository.data){
            if (user.isAuthenticate) {
                countLogged++;
            }
        }
        assertEquals(2, countLogged);
 
    }


}
