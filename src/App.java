import java.util.Scanner;

import entities.BrazilInterestService;
import entities.InterestService;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount:");
        double amount = sc.nextDouble();
        System.out.print("Enter the number of months: ");
        int months = sc.nextInt();

        InterestService is = new BrazilInterestService(2.0);
        double payment = is.payment(amount, months);
        System.out.println("mes: " + months);
        System.out.println("The payment is: " + String.format("%.2f", payment));
        sc.close();
    }
}
