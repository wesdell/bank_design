import java.util.ArrayList;

public class Bank {
  private final String name;
  private final ArrayList<Client> clients = new ArrayList<Client>();

  public Bank(String name) {
    this.name = name;
  }

  public SavingAccount createSavingAccount(NaturalClient client) {
    SavingAccount savingAccount = new SavingAccount();
    client.addAccount(savingAccount);
    this.addClient(client);
    return savingAccount;
  }

  public CheckingAccount createCheckingAccount(Client client, double amount) {
    if (!client.isValidAmountToGetSavingAccount(amount)) {
      return null;
    }

    CheckingAccount checkingAccount = new CheckingAccount(amount);
    client.addAccount(checkingAccount);
    this.addClient(client);
    return checkingAccount;
  }

  private void addClient(Client client) {
    this.clients.add(client);
  }

  @Override
  public String toString() {
    return this.name;
  }
}
