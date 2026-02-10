public class VendingMachineApp {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.addInventory("Soda", 5);
        machine.addInventory("Chips", 3);

        System.out.println("=== User selects Soda ===");
        machine.selectItem("Soda");

        System.out.println("\n=== User inserts 5 ===");
        machine.insertCoin(5);

        System.out.println("\n=== User inserts 5 more ===");
        machine.insertCoin(5);

        System.out.println("\n=== Machine set to OutOfOrder ===");
        machine.setOutOfOrder();

        System.out.println("\n=== User tries to select Chips ===");
        machine.selectItem("Chips");
    }
}
