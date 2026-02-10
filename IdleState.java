public class IdleState implements VendingMachineState {
    private VendingMachine machine;

    public IdleState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void selectItem(String item) {
        if (machine.getInventory().containsKey(item) && machine.getInventory().get(item) > 0) {
            System.out.println("🟢 " + item + " selected.");
            machine.setSelectedItem(item);
            machine.setCurrentState(machine.getItemSelectedState());
        } else {
            System.out.println("❌ " + item + " is not available.");
        }
    }

    @Override
    public void insertCoin(double amount) {
        System.out.println("⚠️ Cannot insert coin. No item selected.");
    }

    @Override
    public void dispenseItem() {
        System.out.println("⚠️ Cannot dispense. No item selected.");
    }

    @Override
    public void setOutOfOrder() {
        System.out.println("❌ Machine is now out of order.");
        machine.setCurrentState(machine.getOutOfOrderState());
    }
}
