public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService ();
        // int amount = 1_000_000;
        // int numberOfYears = 1;
        int totalOne = service.calculate(1_000_000, 1);
        int totalTwo = service.calculate(1_000_000, 2);
        int totalThree = service.calculate(1_000_000, 3);

        System.out.println(totalOne);
        System.out.println(totalTwo);
        System.out.println(totalThree);

    }
}