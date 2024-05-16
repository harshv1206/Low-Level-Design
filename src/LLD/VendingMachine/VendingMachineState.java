package LLD.VendingMachine;

public interface VendingMachineState {
    public void insertCoin(VendingMachine vendingMachine);
    public void getRefund(VendingMachine vendingMachine);
    public void chooseItem(VendingMachine vendingMachine);
    public void dispenseItem(VendingMachine vendingMachine);
}
