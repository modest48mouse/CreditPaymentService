public class CreditPaymentService {
    public double calculate(double amountOfCredit, double creditTern, double percent) {
        double PC = percent / 12 / 100;
        double x1 = 1 + PC;
        double y1 = creditTern;

        double result = (amountOfCredit * PC * (Math.pow(x1, y1)) / ((Math.pow(x1, y1)) - 1));
        return result;
    }
}
