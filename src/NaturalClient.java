public class NaturalClient extends Client {
  public NaturalClient(String name) {
    super(name);
  }

  @Override
  public boolean isValidAmount(double amount) {
    return amount >= 200;
  }
}
