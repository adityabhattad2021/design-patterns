package states;

import vending_machine.VendingMachine;

public class SelectionState implements IVendingMachineState {

    VendingMachine context;

    public SelectionState(VendingMachine context){
        this.context=context;
    }

    @Override
    public void selectProduct() {
        System.out.println("Please select a product:\nNamkeen\nChips\nBiscuit");
        context.changeState(context.getDispensingState());
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Make a selection first.");

    }

    @Override
    public void refillStock() {
        System.out.println("The machine is in select state, cannot refill now.");
    }
    
}
