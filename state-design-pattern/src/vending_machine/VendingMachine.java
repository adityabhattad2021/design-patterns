package vending_machine;
import states.DispensingState;
import states.IVendingMachineState;
import states.IdleState;
import states.OutOfStockState;
import states.SelectionState;

public class VendingMachine {

    private IVendingMachineState currentState;
    private IVendingMachineState idleState;
    private IVendingMachineState selectionState;
    private IVendingMachineState dispensingState;
    private IVendingMachineState outOfStockState;

    public VendingMachine(){
        idleState = new IdleState(this);
        selectionState = new SelectionState(this);
        dispensingState = new DispensingState(this);
        outOfStockState = new OutOfStockState(this);

        currentState = idleState;
    }
    
    public void selectProduct(){
        currentState.selectProduct();
    }

    public void dispenseProduct(){
        currentState.dispenseProduct();
    }

    public void refillStock(){
        currentState.refillStock();
    }

    public void changeState(IVendingMachineState state){
        currentState=state;
    }

    public IVendingMachineState getIdleState() {return idleState;}
    public IVendingMachineState getSelectionState() {return selectionState;}
    public IVendingMachineState getDispensingState() {return dispensingState;}
    public IVendingMachineState getOutOfStockState() {return outOfStockState;}

}
