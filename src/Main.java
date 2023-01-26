public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double myCreditPaymentService = service.calculate(1_000_000, 12, 9.99);
        System.out.println("1_000_000 / 12 / 9.99");
        System.out.println(service.calculate(1_000_000, 12, 9.99));

        System.out.println();
        System.out.println("1_000_000 / 24 / 9.99");
        System.out.println(service.calculate(1_000_000, 24, 9.99));

        System.out.println();
        System.out.println("1_000_000 / 36 / 9.99");
        System.out.println(service.calculate(1_000_000, 36, 9.99));

    }
}