import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService sqrService = new SQRService();

        int minLimit = 200;
        int maxLimit = 300;

        int quantity = sqrService.calculate(minLimit, maxLimit);
        System.out.println(quantity);
    }
}
