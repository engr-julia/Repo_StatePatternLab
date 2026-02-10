public class OutOfOrderState implements VendingMachineState {
    private VendingMachine machine;

    public OutOfOrderState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void selectItem(String item) {
        System.out.println("❌ Machine is out of order. Cannot select item.");
    }

    @Override
    public void insertCoin(double amount) {
        System.out.println("❌ Machine is out of order. Cannot insert coin.");
    }

    @Override
    public void dispenseItem() {
        System.out.println("❌ Machine is out of order. Cannot dispense item.");
    }

    @Override
    public void setOutOfOrder() {
        System.out.println("❌ Machine is already out of order.");
    }
}
