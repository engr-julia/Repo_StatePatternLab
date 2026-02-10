public class DispensingState implements VendingMachineState {
    private VendingMachine machine;

    public DispensingState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void selectItem(String item) {
        System.out.println("⚠️ Dispensing in progress. Cannot select item.");
    }

    @Override
    public void insertCoin(double amount) {
        System.out.println("⚠️ Dispensing in progress. Cannot insert coin.");
    }

    @Override
    public void dispenseItem() {
        System.out.println("🔄 Dispensing " + machine.getSelectedItem() + "...");
        machine.reduceInventory(machine.getSelectedItem());
        machine.resetTransaction();
        machine.setCurrentState(machine.getIdleState());
        System.out.println("✅ Transaction complete. Machine is now idle.");
    }

    @Override
    public void setOutOfOrder() {
        System.out.println("❌ Machine is now out of order.");
        machine.setCurrentState(machine.getOutOfOrderState());
    }
}
