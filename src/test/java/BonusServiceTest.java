import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {

    @Test
    public void testRegisteredUnderLimit() {
        BonusService service = new BonusService();

        int expected = 30;
        int actual = service.calcBonus(1_000, true);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testRegisteredOverLimit() {
        BonusService service = new BonusService();

        int expected = 500;
        int actual = service.calcBonus(1_000_000, true);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testUnRegisteredUnderLimit() {
        BonusService service = new BonusService();

        int expected = 10;
        int actual = service.calcBonus(1_000, false);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testUnRegisteredOverLimit() {
        BonusService service = new BonusService();

        int expected = 500;
        int actual = service.calcBonus(1_000_000, false);

        Assertions.assertEquals(expected, actual);
    }
}
