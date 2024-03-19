//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount = 1_000_000;
        int months = 12;
        int annuityPayment = service.calculate(amount, months);

        System.out.println("Ежемесячный платеж: " + annuityPayment);
    }
}
