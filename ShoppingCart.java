import java.util.ArrayList;

public class ShoppingCart {
    private String customerName = "none";
    private String currentDate = "January 1, 2016";
    private ArrayList<ItemToPurchase> cartItems = new ArrayList<>(); // check this

    public ShoppingCart() {}

    public ShoppingCart(String name, String date) {
        this.customerName = name;
        this.currentDate = date;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getDate() {
        return this.currentDate;
    }

    public void addItem(ItemToPurchase item) {
        this.cartItems.add(item);
    }

    public void removeItem(String name) {
        boolean found = false;
        // for each loop
        // for each item (ItemToPurchase) in this.cartItems (array/ iterable) 
        for (ItemToPurchase item : this.cartItems) {
            if (item.getName().equalsIgnoreCase(name)) {
                this.cartItems.remove(item);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found in cart. Nothing removed.");
        }
    }

    public void modifyItem(ItemToPurchase item) {
        boolean found = false;
        for (ItemToPurchase currentItem : this.cartItems) {
            if (currentItem.getName().equalsIgnoreCase(item.getName())) {
                if (!item.getDescription().equals("none")) {
                    currentItem.setDescription(item.getDescription());
                }
                if (item.getPrice() >= 0) { 
                    currentItem.setPrice(item.getPrice());
                }
                if (item.getQuantity() >= 0) {
                    currentItem.setQuantity(item.getQuantity());
                }
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found in cart. Nothing modified.");
        }
    }

    // public void modifyItem(String Name, double price, int quantity) { }

    public int getNumItemsInCart() {
        // int totalQuantity = 0;
        // for (ItemToPurchase item : cartItems) {
        //     totalQuantity += item.getQuantity();
        // }
        // return totalQuantity;
        return this.cartItems.size();
    }

    public double getCostOfCart() {
        double totalCost = 0;
        for (ItemToPurchase item : this.cartItems) {
            totalCost += item.getPrice() * item.getQuantity();
        }
        return totalCost;
    }

    public void printTotal() {
        if (this.cartItems.isEmpty()) {
            System.out.println("SHOPPING CART IS EMPTY");
            return;
        }
        System.out.println(customerName + "'s Shopping Cart - " + currentDate);
        System.out.println("Number of Items: " + cartItems.size());
        System.out.println();
        for (ItemToPurchase item : cartItems) {
            item.printItemCost();
        }
        System.out.println();
        System.out.println("Total: $" + getCostOfCart());
    }

    public void printDescriptions() {
        if (this.cartItems.isEmpty()) {
            System.out.println("SHOPPING CART IS EMPTY");
            return;
        }
        System.out.println(customerName + "'s Shopping Cart - " + currentDate);
        System.out.println();
        System.out.println("Item Descriptions");
        for (ItemToPurchase item : this.cartItems) {
            item.printItemDescription();
        }
    }
}
