import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private VendingMachineState idleState;
    private VendingMachineState itemSelectedState;
    private VendingMachineState dispensingState;
    private VendingMachineState outOfOrderState;

    private VendingMachineState currentState;
    private Map<String, Integer> inventory;
    private double balance;
    private String selectedItem;

    public VendingMachine() {
        idleState = new IdleState(this);
        itemSelectedState = new ItemSelectedState(this);
        dispensingState = new DispensingState(this);
        outOfOrderState = new OutOfOrderState(this);

        currentState = idleState;
        inventory = new HashMap<>();
        balance = 0;
    }

    // State getters
    public VendingMachineState getIdleState() { return idleState; }
    public VendingMachineState getItemSelectedState() { return itemSelectedState; }
    public VendingMachineState getDispensingState() { return dispensingState; }
    public VendingMachineState getOutOfOrderState() { return outOfOrderState; }

    // Inventory & transaction methods
    public Map<String, Integer> getInventory() { return inventory; }
    public void addInventory(String item, int quantity) { inventory.put(item, quantity); }

    public double getBalance() { return balance; }
    public void addBalance(double amount) { balance += amount; }

    public String getSelectedItem() { return selectedItem; }
    public void setSelectedItem(String item) { selectedItem = item; }

    public double getItemPrice() { return 10; } // fixed price for simplicity
    public void reduceInventory(String item) { inventory.put(item, inventory.get(item) - 1); }
    public void resetTransaction() { balance = 0; selectedItem = null; }

    // State management
    public void setCurrentState(VendingMachineState state) { currentState = state; }

    // Delegated operations
    public void selectItem(String item) { currentState.selectItem(item); }
    public void insertCoin(double amount) { currentState.insertCoin(amount); }
    public void dispenseItem() { currentState.dispenseItem(); }
    public void setOutOfOrder() { currentState.setOutOfOrder(); }
}
