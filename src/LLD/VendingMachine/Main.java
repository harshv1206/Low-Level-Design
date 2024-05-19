package LLD.VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        VendingMachineState state = machine.getVendingMachineState();
        //Idle State
        state.clickOnInsertCoinButton(machine);

        //Has Money State
        state = machine.getVendingMachineState();
        state.insertCoin(machine,Coin.NICKIL);
        state.insertCoin(machine,Coin.DIME);

        state.chooseItem(machine,101);

        state = machine.getVendingMachineState();
        state.dispenseItem(machine,101);

    }
}
