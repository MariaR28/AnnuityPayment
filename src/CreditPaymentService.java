public class CreditPaymentService {
    public int calculate(int amount, int months) {
        double monthlyInterestRate = ((9.99 / months) / 100);
        double ratio = (monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, months) / ((Math.pow(1 + monthlyInterestRate, months)) - 1)));
        double result = amount * ratio;
        return (int) result;
    }
}
