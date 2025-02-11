package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.StateDesignPattern.State;

import SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.StateDesignPattern.Coin;
import SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.StateDesignPattern.Item;
import SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.StateDesignPattern.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State {

    public IdleState() {
        System.out.println("Currently Vending Machine is in Idle State");
    }

    public IdleState(VendingMachine vendingMachine) {
        System.out.println("Currently Vending Machine is in Idle State");
        vendingMachine.setCoins(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) {
        vendingMachine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("First you need to insert coin button");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception{
        throw new Exception("You can not insert coin in idle state");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int code) throws Exception {
        throw new Exception("You can not choose product in idle state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("You can not get change in idle state");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int code) throws Exception {
        throw new Exception("Product cannot be dispensed in idle state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You can not get refund in idle state");
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int code) throws Exception {
        vendingMachine.getInventory().addItem(item, code);
    }
}
