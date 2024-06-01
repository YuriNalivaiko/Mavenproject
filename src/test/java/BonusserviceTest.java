import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BonusserviceTest {

    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // Подготавливаем данные:
        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        // Вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // Производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // Подготавливаем данные:
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;

        // Вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // Производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForUnregisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // Подготавливаем данные:
        long amount = 2000;
        boolean registered = false;
        long expected = 20;

        // Вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // Производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForUnregisteredAndOverLimit() {
        BonusService service = new BonusService();

        // Подготавливаем данные:
        long amount = 2_000_000;
        boolean registered = false;
        long expected = 500;

        // Вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // Производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}
