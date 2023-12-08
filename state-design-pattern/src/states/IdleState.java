package states;
import vending_machine.VendingMachine;

public class IdleState implements IVendingMachineState {

    private VendingMachine context;

    public IdleState(VendingMachine context){
        this.context = context;
    }

    @Override
    public void selectProduct() {
        context.changeState(context.getSelectionState());
        context.selectProduct();
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Select a product first!");
    }

    @Override
    public void refillStock() {
        System.out.println("No need to refill as currently the machine is in idle state.");
    }
    
}
