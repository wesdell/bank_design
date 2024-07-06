public class OverDrawException extends Exception {
    public OverDrawException(double amountToTakeOut, double debtLimit) {
        super("La cantidad a retirar: " + amountToTakeOut + " super el limite establecido: " + debtLimit);
    }
}
