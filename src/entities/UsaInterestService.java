package entities;

public class UsaInterestService implements InterestService {
    private double interest;

    public UsaInterestService(double interest) {
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
        // TODO Auto-generated method stub
        return interest;
    }

    @Override
    public double payment(double amount, int months) {
        return amount * Math.pow(1 + interest / 100.0, months);
    }
}
