public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int credit = 1_000_000;
        double creditRate = 9.99;
        int period = 1;

        double creditPayment = service.calculate(credit, creditRate, period);

        String creditPaymentInteger = String.format("%.0f", creditPayment);
        System.out.println("Сумма кредита: " + credit + " руб");
        System.out.println("Годовая процентная ставка: " + creditRate + " %");
        System.out.println("Срок кредита: " + period + " год(а)");
        System.out.println("Сумма ежемесячного платежа: " + creditPaymentInteger + " руб");
    }
}