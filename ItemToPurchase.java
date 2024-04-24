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

    public void setDescription(String newDescription) {
        this.itemDescription = newDescription;
    }

    public String getDescription() {
        return this.itemDescription;
    }

    public void printItemCost() {
        System.out.println(name + " " + itemQuantity + " @ $" + itemPrice + " = $" + (itemQuantity * itemPrice));
    }

    public void printItemDescription() {
        System.out.println(name + ": " + itemDescription);
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return itemPrice;
    }

    public int getQuantity() {
        return itemQuantity;
    }

    // Setters
    public void setName(String newName) {
        this.name = newName;
    }

    public void setQuantity(int newQuantity) {
        this.itemPrice = newQuantity;
    }

    public void setPrice(double newItemPrice) {
        this.itemPrice = newItemPrice;
    }
}
