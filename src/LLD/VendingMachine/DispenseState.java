package LLD.VendingMachine;

public class DispenseState implements VendingMachineState{

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) {
          throw new RuntimeException("machine is in dispense state");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) {
        throw new RuntimeException("machine is in dispense state");
    }

    @Override
    public void getRefund(VendingMachine vendingMachine) {
        throw new RuntimeException("machine is in dispense state");
    }

    @Override
    public void chooseItem(VendingMachine vendingMachine, int codeNumber) {
        throw new RuntimeException("machine is in dispense state");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine, int codeNumber) {
        throw new RuntimeException("machine is in dispense state");
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) {
        throw new RuntimeException("machine is in dispense state");
    }

    public Item dispenseProduct(VendingMachine machine, int codeNumber){
        Inventory inventory = machine.getInventory();
        for(ItemShelf shelf : inventory.getInventory()){
            if(shelf.isSoldOut() == false && shelf.getCodeNumber() == codeNumber){
                Item item = shelf.getItem();
                return item;
            }
        }
        throw new RuntimeException("item not found");
    }
}
