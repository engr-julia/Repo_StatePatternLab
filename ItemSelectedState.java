public class ItemSelectedState implements VendingMachineState {
    private VendingMachine machine;

    public ItemSelectedState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void selectItem(String item) {
        System.out.println("⚠️ Item already selected. Cannot select another.");
    }

    @Override
    public void insertCoin(double amount) {
        machine.addBalance(amount);
        System.out.println("🪙 Inserted: " + amount + ". Total balance: " + machine.getBalance());
        if (machine.getBalance() >= machine.getItemPrice()) {
            machine.setCurrentState(machine.getDispensingState());
            machine.dispenseItem();
        }
    }

    @Override
    public void dispenseItem() {
        System.out.println("⚠️ Cannot dispense yet. Please insert enough coins.");
    }

    @Override
    public void setOutOfOrder() {
        System.out.println("❌ Machine is now out of order.");
        machine.setCurrentState(machine.getOutOfOrderState());
    }
}
