import org.junit.jupiter.api.Assertions;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @org.junit.jupiter.api.Test
    public void test1() {
        SQRService sqrService = new SQRService();

        long actual = sqrService.calculate(100, 121);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void test2() {
        SQRService sqrService = new SQRService();

        long actual = sqrService.calculate(300, 400);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
}
