package LLD.VendingMachine;

public class IdleState implements VendingMachineState{

    public IdleState(){
        System.out.println("VendingMachine is in IdleState");
    }
    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) {
           vendingMachine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) {
        throw new RuntimeException("Machine is in IdleState");
    }

    @Override
    public void getRefund(VendingMachine vendingMachine) {
        throw new RuntimeException("Machine is in IdleState");
    }

    @Override
    public void chooseItem(VendingMachine vendingMachine, int codeNumber) {
        throw new RuntimeException("Machine is in IdleState");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine, int codeNumber) {
        throw new RuntimeException("Machine is in IdleState");
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) {
         vendingMachine.getInventory().addItem(item,codeNumber);
    }
}
