package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.StateDesignPattern.State;

import SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.StateDesignPattern.Coin;
import SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.StateDesignPattern.Item;
import SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.StateDesignPattern.VendingMachine;

import java.util.List;

public interface State {
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception;

    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception;

    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception;

    public void chooseProduct(VendingMachine vendingMachine, int code) throws Exception;

    public int getChange(int returnChangeMoney) throws Exception;

    public Item dispenseProduct(VendingMachine vendingMachine, int code) throws Exception;

    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception;

    public void updateInventory(VendingMachine vendingMachine, Item item, int code) throws Exception;
}
