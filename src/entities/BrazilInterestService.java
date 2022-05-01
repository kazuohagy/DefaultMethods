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
    public double getInterestRate() {
        return interest;
    }

}
