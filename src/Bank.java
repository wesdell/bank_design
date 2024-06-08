public class Bank {
  private final String name;
  private int registeredClients;
  private Client[] clients;

  public Bank(String name) {
    this.name = name;
    this.clients = new Client[10];
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
    this.clients[this.registeredClients++] = client;
  }

  @Override
  public String toString() {
    return this.name;
  }
}
