package ru.anka.lesson5.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UserServiceIntegrationTest {
    private UserRepository userRepository;
    private UserService userService;

    @BeforeEach
    public void setUp() {
        // Создаем mock-объект UserRepository
        userRepository = mock(UserRepository.class);

        // Создаем UserService с mock-объектом UserRepository
        userService = new UserService(userRepository);
    }

    @Test
    public void testGetUserFullName() {
        // Предположим, что вам нужно проверить, как UserService обрабатывает случай,
        // когда UserRepository возвращает конкретного пользователя по ID
        int userId = 1;
        String expectedFullName = "John Doe";

        // Задаем поведение mock-объекта UserRepository
        when(userRepository.getUserById(userId)).thenReturn(createFakeUser());

        // Вызываем метод getUserFullName и проверяем, что он возвращает ожидаемое значение
        String actualFullName = userService.getUserFullName(userId);
        assertEquals(expectedFullName, actualFullName);
    }

    private User createFakeUser() {
        User user = new User(1,"John","Doe");
//        user.setUserId(1);
//        user.setFirstName("John");
//        user.setLastName("Doe");
        return user;
    }
}
