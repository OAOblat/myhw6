public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService ();
        int amount = 1_000_000;
        int numberOfYears = 1;
        int total = service.calculate(amount, numberOfYears);
        System.out.println(total);
    }
}