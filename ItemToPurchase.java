public class ItemToPurchase {
    private String itemDescription = "none";
    private String name;
    private double itemPrice;
    private int itemQuantity;

    public ItemToPurchase(String name, String description, double price, int itemQuantity) {
        this.name = name;
        this.itemDescription = description;
        this.itemPrice = price;
        this.itemQuantity = itemQuantity;
    }

    public void setDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getDescription() {
        return itemDescription;
    }

    public void printItemCost() {
        System.out.println(name + " " + itemQuantity + " @ $" + itemPrice + " = $" + (itemQuantity * itemPrice));
    }

    public void printItemDescription() {
        System.out.println(name + ": " + itemDescription);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return itemPrice;
    }

    public int getQuantity() {
        return itemQuantity;
    }
}
