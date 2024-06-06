public abstract class Account {
  private double amount;

  public Account(double amount) {
    this.amount = amount;
  }

  @Override
  public String toString() {
    return "Account{" +
            "amount=" + amount +
            '}';
  }
}
