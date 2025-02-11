package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.StateDesignPattern.State;

import SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.StateDesignPattern.Coin;
import SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.StateDesignPattern.Item;
import SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.StateDesignPattern.VendingMachine;

import java.util.List;

public class DispenseState implements State {

    public DispenseState(VendingMachine vendingMachine, int code) throws Exception {
        System.out.println("Machine is in Dispense State");
        dispenseProduct(vendingMachine, code);
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You can not click on insert coin button in Dispense State");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You can not click on insert coin button in Dispense State");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("You can not click on insert coin button in Dispense State");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int code) throws Exception {
        throw new Exception("You can not click on insert coin button in Dispense State");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("You can not click on insert coin button in Dispense State");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int code) throws Exception {
        Item item = vendingMachine.getInventory().getItem(code);
        System.out.println("Product " + item.getItemType() + " has been dispensed");
        vendingMachine.getInventory().updateSoldOutItem(code);
        vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
        return item;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You can not click on insert coin button in Dispense State");
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int code) throws Exception {
        throw new Exception("You can not click on insert coin button in Dispense State");
    }
}
