public class CreditPaymentService {
    public int calculate(int amount, int numberOfYears) {
        double interestRate = 9.99;
        double rate = interestRate / 100;
        double rateInMonth = rate / 12;
        double rateInMonthPlusOne = rateInMonth + 1;
        double numberOfMonth = numberOfYears * 12;
        double total = amount * (rateInMonth * Math.pow(rateInMonthPlusOne, numberOfMonth)) / (Math.pow(rateInMonthPlusOne, numberOfMonth) - 1);
        return (int) total;

    }

}
