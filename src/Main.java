public class Main {
  public static void main(String[] args) {
    // Dado un banco y dos tipos de clientes
    Bank bank = new Bank("GP");
    NaturalClient sebastian = new NaturalClient("Sebastian");
    LegalClient edwin = new LegalClient("Edwin");
    SavingAccount account1 = bank.createSavingAccount(sebastian);
    CheckingAccount account2 = bank.createCheckingAccount(sebastian, 150.00);
    CheckingAccount account3 = bank.createCheckingAccount(edwin, 500.00);

    System.out.println(account1);
    account1.deposit(3);
    System.out.println(account1);
    account1.takeOut(20);
    System.out.println(account1);
    System.out.println(account2);
    System.out.println(account3);
  }
}
