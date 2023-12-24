public class RewardValue {
    private double cashValue;
    private int milesValue;

    // Conversion rate constant
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    };
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    public int getMilesValue(){
        return milesValue;
    };

    public double getCashValue() {
        return cashValue;
    }
}
