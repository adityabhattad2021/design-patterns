package states;

import vending_machine.VendingMachine;

public class DispensingState implements IVendingMachineState {

    VendingMachine context;

    public DispensingState(VendingMachine context){
        this.context=context;
    }

    @Override
    public void selectProduct() {
        System.out.println("Already dispensing a product.");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Product removed enjoy your product.");
        context.changeState(context.getOutOfStockState());
    }

    @Override
    public void refillStock() {
        System.out.println("Cannot refill in dispensing state.");
    }
    
}
