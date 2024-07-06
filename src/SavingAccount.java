public class SavingAccount extends Account {
  public SavingAccount() {
    super(0);
  }

  @Override
  protected int getServicesAmount() {
    return 3;
  }

  @Override
  public void takeOut(double amount) throws OverDrawException {
    double amountToTakeOut = this.getAmount() - amount;
    if (!this.isPositiveNumber(amountToTakeOut)) {
      throw new OverDrawException(amountToTakeOut, this.getAmount());
    }
    this.setAmount(amountToTakeOut);
  }
}
