import org.junit.jupiter.api.Test;
import ru.netology.service.CashbackHackService;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CashbackHackServiceTest {


    @Test
    public void cashbackAmount0Test(){
        CashbackHackService cashbackHackService = new  CashbackHackService();
        int amount = 0;
        int actual = cashbackHackService.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void cashbackAmount500Test(){
        CashbackHackService cashbackHackService = new  CashbackHackService();
        int amount = 500;
        int actual = cashbackHackService.remain(amount);
        int expected = 500;
        assertEquals(expected, actual);
    }
    @Test
    public void cashbackAmount1000Test(){
        CashbackHackService cashbackHackService = new  CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void cashbackAmount999Test(){
        CashbackHackService cashbackHackService = new  CashbackHackService();
        int amount = 999;
        int actual = cashbackHackService.remain(amount);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void cashbackAmountLessThanZeroTest(){
        CashbackHackService cashbackHackService = new  CashbackHackService();
        int amount = -1;
        int actual = cashbackHackService.remain(amount);
        int expected = 1001;
        assertEquals(expected, actual);
    }
}
