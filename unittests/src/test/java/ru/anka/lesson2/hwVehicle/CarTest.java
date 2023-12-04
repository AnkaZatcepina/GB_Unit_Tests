package ru.anka.lesson2.hwVehicle;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


/*
 - Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя
оператор instanceof).
 - Проверить, что объект Car создается с 4-мя колесами.
 - Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
 - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина
останавливается (speed = 0).
*/
class CarTest {
    private static Car car;

    @BeforeEach
    void setUp() {
        car = new Car("Lada", "Vesta", 2019);
    }

    @AfterEach
    void tearDown() {
        car = null;
    }

    @Test
    void isVehicle(){
        assertInstanceOf(Vehicle.class, car);
    }

    @Test
    void hasFourWheels(){
        assertEquals(4, car.getNumWheels());
    }

    @Test
    void testSpeed(){
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    void testParkStop(){
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }
}
