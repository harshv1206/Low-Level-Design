package LLD.VendingMachine;

import LLD.VendingMachine.States.IdleState;
import LLD.VendingMachine.States.VendingMachineState;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    VendingMachineState vendingMachineState;
    List<Coin> coinList;
    Inventory inventory;

    public VendingMachineState getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(VendingMachineState vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }



    public VendingMachine(){
        vendingMachineState = new IdleState();
        coinList = new ArrayList<>();
        inventory = new Inventory(10);
    }
}
