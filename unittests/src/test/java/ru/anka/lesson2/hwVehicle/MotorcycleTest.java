package ru.anka.lesson2.hwVehicle;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/*
 - Проверить, что объект Motorcycle создается с 2-мя колесами.
 - Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод
testDrive()).
 - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл
останавливается (speed = 0).
*/
class MotorcycleTest {
    private static Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        motorcycle = new Motorcycle("Yamaha", "r1", 2021);
    }

    @AfterEach
    void tearDown() {
        motorcycle = null;
    }

    @Test
    void hasTwoWheels(){
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    void testSpeed(){
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    void testParkStop(){
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    } 
}
