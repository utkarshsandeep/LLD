package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.StateDesignPattern.State;

import SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.StateDesignPattern.Coin;
import SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.StateDesignPattern.Item;
import SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.StateDesignPattern.VendingMachine;

import java.util.List;

public class SelectionState implements State {

    public SelectionState() {
        System.out.println("Currently machine is in selection state");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You can not click on insert coin button in Selection State");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        return;
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("You can not insert coin in Selection State");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int code) throws Exception {
        Item item = vendingMachine.getInventory().getItem(code);
        int insertedCoins = 0;
        for (Coin coin : vendingMachine.getCoins()) {
            insertedCoins = insertedCoins + coin.value;
        }

        if (item.getPrice() > insertedCoins) {
            System.out.println("Total coins inserted : " + insertedCoins + " and Price of item "
                    + item.getItemType().name() + " is : " + item.getPrice());
            refundFullMoney(vendingMachine);
            throw new Exception("Insufficient Amount");
        }
        if (item.getPrice() < insertedCoins) {
            System.out.println("Price of product : " + item.getPrice());
            System.out.println("Total coins inserted : " + insertedCoins);
            getChange(insertedCoins - item.getPrice());
        }
        vendingMachine.setVendingMachineState(new DispenseState(vendingMachine, code));

    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        System.out.println("Return extra money in coin disperse tray :" + returnChangeMoney);
        return returnChangeMoney;
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int code) throws Exception {
        throw new Exception("Product can not be dispensed in Selection State");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        System.out.println("Refund full money back to Coin dispense tray");
        vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
        return vendingMachine.getCoins();
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int code) throws Exception {
        throw new Exception("You can not update inventory in Selection State");
    }
}
