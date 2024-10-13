//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9876"));
        context.payAmount(5000);

        context.setPaymentStrategy(new PaypalPayment("user@example.com"));
        context.payAmount(3000);

        context.setPaymentStrategy(new MobileBankingPayment("017XXXXXXXX"));
        context.payAmount(1500);
    }
}