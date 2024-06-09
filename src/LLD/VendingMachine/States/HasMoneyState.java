package LLD.VendingMachine.States;

import LLD.VendingMachine.*;

public class HasMoneyState implements VendingMachineState {
    public HasMoneyState(){
        System.out.println("VendingMachine is in HasMoneyState");

    }
    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) {
         throw new RuntimeException("VendingMachine is in HasMoneyState");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) {
       vendingMachine.getCoinList().add(coin);
       vendingMachine.setVendingMachineState(new SelectionState());
    }

    @Override
    public void getRefund(VendingMachine vendingMachine) {
        throw new RuntimeException("VendingMachine is in HasMoneyState");
    }

    @Override
    public void chooseItem(VendingMachine vendingMachine, int codeNumber) {
        throw new RuntimeException("VendingMachine is in HasMoneyState");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine, int codeNumber) {
        throw new RuntimeException("VendingMachine is in HasMoneyState");
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) {
        throw new RuntimeException("VendingMachine is in HasMoneyState");
    }
}
