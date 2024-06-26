import java.util.Scanner;

public class ShoppingCartManager {
    public static void printMenu() {
        System.out.println("MENU");
        System.out.println("a - Add item to cart");
        System.out.println("d - Remove item from cart");
        System.out.println("c - Change item quantity");
        System.out.println("i - Output items' descriptions");
        System.out.println("o - Output shopping cart");
        System.out.println("q - Quit");
    }

    public static void ExecuteMenu(char choice, ShoppingCart cart, Scanner scnr) {
        switch (choice) {
            case 'a':
                System.out.println("ADD ITEM TO CART");
                System.out.print("Enter the item name: ");
                String name = scnr.nextLine();
                System.out.print("Enter the item description: ");
                String description = scnr.nextLine();
                System.out.print("Enter the item price: ");
                double price = scnr.nextDouble();
                System.out.print("Enter the item quantity: ");
                int quantity = scnr.nextInt();
                scnr.nextLine(); 
                ItemToPurchase itemToAdd = new ItemToPurchase(name, description, price, quantity);
                cart.addItem(itemToAdd);
                break;

            case 'd':
                System.out.println("REMOVE ITEM FROM CART");
                System.out.print("Enter name of item to remove: ");
                scnr.nextLine(); 
                String itemToRemove = scnr.nextLine();
                cart.removeItem(itemToRemove);
                break;

            case 'c':
                System.out.println("CHANGE ITEM QUANTITY");
                // get an existing item from the cart
                // changing the item quality

                System.out.print("Enter the item name: ");
                String itemName = scnr.nextLine();

                // is item in cart
                // if the item is not in the cart then refuse.

                System.out.print("Enter the new quantity: ");
                int newQuantity = scnr.nextInt();
                scnr.nextLine(); 


                // ItemToPurchase modifyItem = new ItemToPurchase(itemName, description, price, quantity);

                // modifyItem.setName(name);
                // modifyItem.setQuantity(newQuantity);
                // cart.modifyItem(modifyItem);
                break;

            case 'i':
                System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
                cart.printDescriptions();
                break;

            case 'o':
                System.out.println("OUTPUT SHOPPING CART");
                cart.printTotal();
                break;

            case 'q':
                System.out.println("Goodbye!");
                break;

            default:
                System.out.println("Invalid choice. Please choose a valid option.");
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter customer's name:");
        String customerName = scnr.nextLine();
        System.out.println("Enter today's date:");
        String currentDate = scnr.nextLine();
        


        ShoppingCart cart = new ShoppingCart(customerName, currentDate);

        cart.printCustomerName(customerName, currentDate); 

        char choice;
        do {
            printMenu();
            System.out.print("Choose an option: ");
            choice = scnr.nextLine().charAt(0);
            // ExecuteMenu(choice, cart, scnr);
        } while (choice != 'q');
    }
}
