package LLD.VendingMachine;

public enum Coin {
    PENNY(1),
    NICKIL(5),
    DIME(10),
    QUATER(25);

    public int value;
    Coin(int value){
        this.value = value;
    }
}
