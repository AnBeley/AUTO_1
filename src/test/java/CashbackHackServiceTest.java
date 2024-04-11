import org.testng.annotations.Test;
import ru.netology.CashbackHackService;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnRemainValue0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1_000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnRemainValue766() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1_234;
        int expected = 766;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnRemainValue999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnRemainValue1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int expected = 1_000;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnRemainValue1001() {
        CashbackHackService service = new CashbackHackService();
        int amount = -1;
        int expected = 1_001;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}
