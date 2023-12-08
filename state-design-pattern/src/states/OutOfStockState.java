package states;

import vending_machine.VendingMachine;

public class OutOfStockState implements IVendingMachineState{

    VendingMachine context;

    public OutOfStockState(VendingMachine context){
        this.context=context;
    }

    @Override
    public void selectProduct() {
        System.out.println("Machine is out of stock.");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Machine is out of stock.");

    }

    @Override
    public void refillStock() {
        System.out.println("Refilling the machine");
        context.changeState(context.getIdleState());
    }
    
}
