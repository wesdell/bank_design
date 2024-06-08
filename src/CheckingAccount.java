public class CheckingAccount extends Account {
  public static final double DEBT_LIMIT = -1000.00;

  private CheckBook checkBook;

  public CheckingAccount(double amount) {
    super(amount);
    this.checkBook = new CheckBook();
  }

  @Override
  protected int getServicesAmount() {
    return 4;
  }

  @Override
  public void takeOut(double amount) {
    double amountToTakeOut = this.getAmount() - amount;
    if (amountToTakeOut < DEBT_LIMIT) {
      return;
    }
    this.setAmount(amountToTakeOut);
  }
}
