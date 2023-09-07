package lesson32;

public class UnitTesting {

    /*
    Юнит Тестирование JUnit5

    Тестирование это когда один программный код запускает другой с целью проверки его
    функционирования на соответсвие ожидаемому результату

    Виды тестирования :
    unit тестирование - тестирование отдельных методов
    integration testing - проверяет работает ли вся система или какой то ее компонент  в соответствии
    с ожиданиями

    performance test  проверка эффективности работы системы при высокой нагрузки

    JUnit 5

    Платформа JUnit
    JUnit Jupiter
    JUnit Vintage

    Для тестирования методов какого либо класса обычно создается отдельный тестовый класс который принято
    называть по имени тестируемого класса прибавляя в конце слово Test
    Car-CarTest

    Основные аннотации JUnit
    @BeforeEach метод будет запускаться перед каждым тестовым методом
    @DisplayName может использоваться для определения имени теста
    @Test становится тестовым методом
     */

    public static void main(String[] args) {
        Calculator calculator;
        calculator = new Calculator();
        System.out.println(calculator.multiply(4, 5));
    }
}
