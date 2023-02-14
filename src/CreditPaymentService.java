public class CreditPaymentService {

    public double calculate(int credit, double creditRate, int period) {

        double crm = creditRate / 100 / 12; // Месячная кредитная ставка

        int dm = period * 12; // Расчёт срока кредита в месяцах

        double elevate = Math.pow(1 + crm, dm); // Промежуточный расчёт

        double creditPayment = credit * (crm + (crm / (elevate - 1)));  // Расчитываем ежемесячный платёж

        return creditPayment;  // Возвращаем сумму месячного платежа
    }
}