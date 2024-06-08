abstract public class Client {
  private final String name;
  private int registeredAccounts;
  private Account[] accounts;

  public Client(String name) {
    this.name = name;
    this.accounts = new Account[10];
  }

  public void addAccount(Account account) {
    this.accounts[this.registeredAccounts++] = account;
  }

  public abstract boolean isValidAmountToGetSavingAccount(double amount);
}
