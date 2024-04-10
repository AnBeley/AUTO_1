import org.junit.Test;


public class CashbackHackServiceTest {
    @Test
    public void shouldReturnRemainValue0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
}
