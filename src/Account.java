public abstract class Account {
  private final SavingPaymentTool[] paymentTools;
  private double amount;
  private double maintenanceCost;

  public Account(double amount) {
    this.amount = amount;
    this.paymentTools = new SavingPaymentTool[3];
    this.paymentTools[0] = new DebitCard();
    this.paymentTools[1] = new OnlineBank();
    this.paymentTools[2] = new SavingBook();
  }

  public double getAmount() {
    return this.amount;
  }

  public void setAmount(double newAmount) {
    this.amount = newAmount;
  }

  public void getMaintenanceCost() {
    this.maintenanceCost = this.getServicesAmount();
  }

  public void deposit(double amountToDeposit) {
    if (!this.isPositiveNumber(amountToDeposit)) {
      return;
    }
    this.amount += amountToDeposit;
  }

  public boolean isPositiveNumber(double number) {
    return number > 0;
  }

  public abstract void takeOut(double amountToTakeOut) throws OverDrawException;
  protected abstract int getServicesAmount();

  @Override
  public String toString() {
    return "Account{" +
            "amount=" + amount +
            '}';
  }
}
