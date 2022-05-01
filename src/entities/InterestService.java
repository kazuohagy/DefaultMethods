package entities;

public interface InterestService {
    double getInterestRate();

    default double payment(double amount, int months) {
        return amount * Math.pow(1 + getInterestRate() / 100.0, months);

    }
}
