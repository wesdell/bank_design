public class SavingAccount extends Account {
  public static final double INTEREST_PERCENTAGE = 1.00;

  public SavingAccount() {
    super(0);
  }

  @Override
  protected int getServicesAmount() {
    return 3;
  }

  @Override
  public void takeOut(double amount) {
    double amountToTakeOut = this.getAmount() - amount;
    if (!this.isPositiveNumber(amountToTakeOut)) {
      return;
    }
    this.setAmount(amountToTakeOut);
  }
}
