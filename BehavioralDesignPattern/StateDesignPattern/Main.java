package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.StateDesignPattern;

import SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.StateDesignPattern.State.State;

import static SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.StateDesignPattern.ItemType.COKE;
import static SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.StateDesignPattern.ItemType.JUICE;
import static SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.StateDesignPattern.ItemType.PEPSI;
import static SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.StateDesignPattern.ItemType.SODA;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        try {
            System.out.println("***********************************");
            System.out.println("Filling up the inventories");
            System.out.println("***********************************");
            fillInventory(vendingMachine);
            displayInventory(vendingMachine);
            System.out.println("***********************************");
            System.out.println("Clicking on insert coin button");
            State vendingMachineState = vendingMachine.getVendingMachineState();
            vendingMachineState.clickOnInsertCoinButton(vendingMachine);
            vendingMachineState = vendingMachine.getVendingMachineState();
            vendingMachineState.insertCoin(vendingMachine, Coin.TEN);
            vendingMachineState.insertCoin(vendingMachine, Coin.TWENTY);
            System.out.println("***********************************");
            System.out.println("Click on Product Selection");
            vendingMachineState.clickOnStartProductSelectionButton(vendingMachine);
            vendingMachineState = vendingMachine.getVendingMachineState();
            vendingMachineState.chooseProduct(vendingMachine, 102);
            displayInventory(vendingMachine);
            System.out.println("***********************************");
            System.out.println("***********************************");

        } catch (Exception e) {
            System.out.println("Exception in vending machine");
        }
    }

    public static void fillInventory(VendingMachine vendingMachine) {
        ItemShelf[] itemShelves = vendingMachine.getInventory().getItemShelves();
        for (int i = 0; i < itemShelves.length; i++) {
            Item item = new Item();
            if (i >= 0 && i < 3) {
                item.setItemType(COKE);
                item.setPrice(15);
            }
            if (i >= 3 && i < 5) {
                item.setItemType(PEPSI);
                item.setPrice(9);
            }
            if (i >= 5 && i < 7) {
                item.setItemType(JUICE);
                item.setPrice(13);
            }
            if (i >= 7 && i < 10) {
                item.setItemType(SODA);
                item.setPrice(21);
            }
            itemShelves[i].setItem(item);
            itemShelves[i].setSoldOut(false);
        }
    }

    public static void displayInventory(VendingMachine vendingMachine) {
        for (ItemShelf itemShelf : vendingMachine.getInventory().getItemShelves()) {
            System.out.print("Item Code : " + itemShelf.getCode() + " :: ");
            System.out.print("Item Name : " + itemShelf.getItem().getItemType() + " :: ");
            System.out.print("Item Price : " + itemShelf.getItem().getPrice() + " :: ");
            System.out.println("Is Available : " + !itemShelf.isSoldOut());
        }
    }
}
