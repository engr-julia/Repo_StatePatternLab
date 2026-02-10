# 🥤 Vending Machine – State Pattern Implementation

## UML Diagram
![Vending Machine UML](VENDING UML.jpeg)


## 🚀 Project Overview
This project simulates a **Vending Machine** using the **State Pattern**!  
The machine can be in one of four states:  

- **Idle 🟢** – Waiting for a user to select an item.  
- **Item Selected 🟡** – An item is chosen, waiting for coins.  
- **Dispensing 🔄** – The item is being delivered. No other actions allowed!  
- **Out of Order ❌** – Machine is broken or under maintenance. All operations are blocked.  

By using the **State Pattern**, each state has its own behavior, making the code **clean, maintainable, and flexible**. Say goodbye to messy conditional statements! 🙌

---

## 💡 Features
- ✅ Select items only when the machine is idle.  
- ✅ Insert coins only after selecting an item.  
- ✅ Automatic dispensing and inventory update.  
- ✅ Out-of-order handling without crashing the system.  
- ✅ Fully decoupled state logic for **easy future expansion**.  

---

## 📂 Classes & Structure
| Class | Description |
|-------|-------------|
| `VendingMachine` | Context class that tracks current state, inventory, and balance. |
| `VendingMachineState` | Interface defining all allowed operations. |
| `IdleState` | Concrete state for idle behavior. |
| `ItemSelectedState` | Concrete state when an item is selected. |
| `DispensingState` | Concrete state for dispensing items. |
| `OutOfOrderState` | Concrete state for out-of-order situations. |

---

## 🎮 Demo – How it Works
```java
VendingMachine machine = new VendingMachine();
machine.addInventory("Soda", 5);
machine.addInventory("Chips", 3);

machine.selectItem("Soda");        // ✅ User selects Soda
machine.insertCoin(5);             // 🪙 Inserts 5
machine.insertCoin(5);             // 🪙 Inserts 5, Dispensing starts automatically
machine.setOutOfOrder();           // ❌ Machine goes out of order
machine.selectItem("Chips");       // ❌ Cannot select while out of order

---

## 🙋‍♂️ Author


Julia T. Rodrigo – Future Big Data Engineer & Java enthusiast 💡
