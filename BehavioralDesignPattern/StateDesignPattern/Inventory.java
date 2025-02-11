package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.StateDesignPattern;

public class Inventory {

    public ItemShelf[] itemShelves;

    public ItemShelf[] getItemShelves() {
        return itemShelves;
    }

    public void setInventory(ItemShelf[] itemShelves) {
        this.itemShelves = itemShelves;
    }


    public Inventory(int itemCount) {
        itemShelves = new ItemShelf[itemCount];
        initializeEmptyInventory();
    }

    public void initializeEmptyInventory() {
        int startCode = 101;
        for (int i = 0;i< itemShelves.length;i++) {
            ItemShelf shelf = new ItemShelf();
            shelf.setCode(startCode);
            shelf.setSoldOut(true);
            itemShelves[i] = shelf;
            startCode++;
        }
    }

    public void addItem(Item item, int code) throws Exception {
        for (ItemShelf shelf : itemShelves) {
            if (shelf.getCode() == code) {
                if (shelf.isSoldOut()) {
                    shelf.setItem(item);
                    shelf.setSoldOut(false);
                } else {
                    throw new Exception("Already Item Present, can't add");
                }
            }
        }
    }

    public Item getItem(int code) throws Exception {
        for (ItemShelf item : itemShelves) {
            if (item.getCode() == code) {
                if (item.isSoldOut()) {
                    throw new Exception("Item is currently out of stock");
                } else {
                    return item.getItem();
                }
            }
        }
        throw new Exception("Item not found!");
    }

    public void updateSoldOutItem(int code) throws Exception {
        for (ItemShelf shelf : itemShelves) {
            if (shelf.getCode() == code) {
                if (shelf.isSoldOut()) {
                    throw new Exception("Already already sold out, can't sold");
                } else {
                    shelf.setSoldOut(true);
                }
            }
        }
    }
}
