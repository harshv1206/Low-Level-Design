package LLD.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    List<ItemShelf> inventory;
    Inventory(int itemShelfCount){
        inventory = new ArrayList<>(itemShelfCount);
        initilizeInventory();
    }
    private void initilizeInventory(){
        int startCode = 101;
        for(ItemShelf itemShelf : inventory){
            itemShelf.setCodeNumber(startCode);
            itemShelf.setSoldOut(true);
            inventory.add(itemShelf);
            startCode++;
        }
    }
    public List<ItemShelf> getInventory(){
        return inventory;
    }

    public void addItem(Item item, int codeNumber){
        for(ItemShelf itemShelf : inventory) {
            if (itemShelf.codeNumber == codeNumber && itemShelf.isSoldOut() == true) {
                itemShelf.setItem(item);
                itemShelf.setSoldOut(false);
                inventory.add(itemShelf);
            }else{
                throw new RuntimeException("Item is already presnt in the shelf or codeNumber is incorrect");
            }

        }
    }
    public void updateSoldOutShelf(int codeNumber){
        for(ItemShelf itemShelf : inventory) {
            if(itemShelf.codeNumber == codeNumber && itemShelf.isSoldOut == false){
                itemShelf.setSoldOut(true);
            }else{
                throw new RuntimeException("Item is not presnt or wrong codeNumber");
            }
        }
    }

}
