public class Main {
  public static void main(String[] args) {
    // Dado un banco y dos tipos de clientes
    Bank bank = new Bank("GP");
    NaturalClient sebastian = new NaturalClient("Sebastian");
    LegalClient edwin = new LegalClient("Edwin");
    Account account1 = bank.createSavingAccount(sebastian);
    Account account2 = bank.createCheckingAccount(sebastian, 150.00);
    Account account3 = bank.createCheckingAccount(edwin, 500.00);

    System.out.println(account1);
    System.out.println(account2);
    System.out.println(account3);

  }
}
