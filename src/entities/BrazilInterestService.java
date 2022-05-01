package entities;

public class BrazilInterestService {
    private double interest;

    public BrazilInterestService(double interest) {
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public Double payment(double amount, int months) {
        return amount * Math.pow(1 + interest / 100.0, months);

    }
}
