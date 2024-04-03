import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        // principal
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        // Annual Interest Rate
        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        // Period (Years)
        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest,numPayments))
                / (Math.pow(1 + monthlyInterest, numPayments) -1 );

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: ");
        System.out.println(mortgageFormatted);
    }
}