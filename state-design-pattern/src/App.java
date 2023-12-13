import vending_machine.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        VendingMachine vm = new VendingMachine();

        vm.selectProduct();
        vm.dispenseProduct();
        vm.selectProduct();
        vm.refillStock();
        vm.selectProduct();
    }
}
