package LLD.VendingMachine.States;

import LLD.VendingMachine.Coin;
import LLD.VendingMachine.Item;
import LLD.VendingMachine.VendingMachine;

public interface VendingMachineState {
    public void clickOnInsertCoinButton(VendingMachine vendingMachine);
    public void insertCoin(VendingMachine vendingMachine, Coin coin);
    public void getRefund(VendingMachine vendingMachine);
    public void chooseItem(VendingMachine vendingMachine, int codeNumber);
    public void dispenseItem(VendingMachine vendingMachine, int codeNumber);
    public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber);
}
