public class CheckingAccount extends Account {
  public static final double DEBT_LIMIT = -1000.00;

  private final CheckBook checkBook;

  public CheckingAccount(double amount) {
    super(amount);
    this.checkBook = new CheckBook();
  }

  @Override
  protected int getServicesAmount() {
    return 4;
  }

  @Override
  public void takeOut(double amount) throws OverDrawException {
    double amountToTakeOut = this.getAmount() - amount;
    if (amountToTakeOut < DEBT_LIMIT) {
      throw new OverDrawException(amountToTakeOut, DEBT_LIMIT);
    }
    this.setAmount(amountToTakeOut);
  }
}
