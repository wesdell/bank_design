public class NaturalClient extends Client {
  public NaturalClient(String name) {
    super(name);
  }

  @Override
  public boolean isValidAmountToGetSavingAccount(double amount) {
    return amount >= 200;
  }
}
