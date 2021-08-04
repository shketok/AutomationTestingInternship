package tests;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    @BeforeEach
    public void setUp() {
        // Подключение к базе данных
        // Подключение к апи, авторазиция
        // Открытие браузера
        System.out.println(123);
    }


    @AfterEach
    public void tearDown() {
        // Откючения к базе данных
        // Откючения к апи, авторазиция
        // Откючения браузера
        System.out.println(321);
    }
}
