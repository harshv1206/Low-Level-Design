package LLD.VendingMachine;

import java.util.List;

public class ItemShelf {

    Item item;

    @Override
    public String toString() {
        return "ItemShelf{" +
                "item=" + item +
                ", codeNumber=" + codeNumber +
                ", isSoldOut=" + isSoldOut +
                '}';
    }

    public ItemShelf(Item item, int codeNumber, boolean isSoldOut) {
        this.item = item;
        this.codeNumber = codeNumber;
        this.isSoldOut = isSoldOut;
    }

    int codeNumber;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getCodeNumber() {
        return codeNumber;
    }

    public void setCodeNumber(int codeNumber) {
        this.codeNumber = codeNumber;
    }

    public boolean isSoldOut() {
        return isSoldOut;
    }

    public void setSoldOut(boolean soldOut) {
        isSoldOut = soldOut;
    }

    boolean isSoldOut;
}
