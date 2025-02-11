package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.StateDesignPattern;

public class Item {
    public ItemType itemType;
    public int price;

    public ItemType getItemType() {
        return itemType;
    }

    public int getPrice() {
        return price;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
