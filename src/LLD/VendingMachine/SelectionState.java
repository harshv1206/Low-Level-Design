package LLD.VendingMachine;

import java.util.List;

public class SelectionState implements VendingMachineState{
    public SelectionState(){
        System.out.println("Vending Machine is in Selection State");
    }
    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) {
        throw new RuntimeException("Vending Machine is in Selection State");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) {
        throw new RuntimeException("Vending Machine is in Selection State");
    }

    @Override
    public void getRefund(VendingMachine vendingMachine) {

    }

    @Override
    public void chooseItem(VendingMachine vendingMachine, int codeNumber) {

        Inventory inventory = vendingMachine.getInventory();
       for(ItemShelf itemShelf : inventory.getInventory()){
           if(itemShelf.getCodeNumber() == codeNumber && itemShelf.isSoldOut() == false){
                Item item = itemShelf.getItem();
                List<Coin> coinList = vendingMachine.getCoinList();
                int paidByUser = 0;
                for(Coin coin : coinList){
                    paidByUser += coin.value;
                }
                if(item.getPrice() <= paidByUser){
                    vendingMachine.setVendingMachineState(new DispenseState());
                }else{
                    vendingMachine.setVendingMachineState(new IdleState());
                }
           }else{
               throw new RuntimeException("wrong codeNumber or item sold out");
           }
       }
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine, int codeNumber) {
        throw new RuntimeException("Vending Machine is in Selection State");
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) {
        throw new RuntimeException("Vending Machine is in Selection State");
    }
}
