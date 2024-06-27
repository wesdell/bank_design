import java.util.ArrayList;

abstract public class Client {
  private final String name;
  private ArrayList<Account> accounts = new ArrayList<>();

  public Client(String name) {
    this.name = name;
  }

  public void addAccount(Account account) {
    this.accounts.add(account);
  }

  public abstract boolean isValidAmountToGetSavingAccount(double amount);
}
