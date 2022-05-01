package entities;

public class BrazilInterestService implements InterestService {
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

    @Override
    public double payment(double amount, int months) {
        return amount * Math.pow(1 + interest / 100.0, months);

    }

    @Override
    public double getInterestRate() {
        return interest;
    }

}
