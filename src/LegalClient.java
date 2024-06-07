public class LegalClient extends Client {
  public LegalClient(String name) {
    super(name);
  }

  @Override
  public boolean isValidAmount(double amount) {
    return amount >= 500;
  }
}
