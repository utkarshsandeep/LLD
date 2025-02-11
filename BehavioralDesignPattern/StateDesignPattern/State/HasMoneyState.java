package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.StateDesignPattern.State;

import SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.StateDesignPattern.Coin;
import SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.StateDesignPattern.Item;
import SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.StateDesignPattern.VendingMachine;

import java.util.List;

public class HasMoneyState implements State {

    public HasMoneyState() {
        System.out.println("Machine is in currently HasMoneyState");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        return;
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setVendingMachineState(new SelectionState());
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        System.out.println("Inserting Coins : " + coin.value);
        vendingMachine.getCoins().add(coin);
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int code) throws Exception {
        throw new Exception("You can not choose product in HasMoney State");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("You can not get change in Has Money State");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int code) throws Exception {
        throw new Exception("Product can not be dispensed in Has Money State");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        System.out.println("Refund full money back to Coin dispense tray");
        vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
        return vendingMachine.getCoins();
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int code) throws Exception {
        throw new Exception("You can not update inventory in Has Money State");
    }
}
