# 13.6 LAB*: Program: Online shopping cart (Part 2)

Note: Creating multiple Scanner objects for the same input stream yields unexpected behavior. Thus, as good practice is to use a single Scanner object for reading input from System.in. That Scanner object can be passed as an argument to any methods that read input.

This program extends the earlier "Online shopping cart (Part 1)" program. (Consider first saving your earlier program).

## Step 1: Extend the ItemToPurchase class per the following specifications:
Private fields
string itemDescription - Initialized in default constructor to "none"
Parameterized constructor to assign item name, item description, item price, and item quantity. (1 pt)
Public member methods
setDescription() mutator & getDescription() accessor (2 pts)
printItemCost() - Outputs the item name followed by the quantity, price, and subtotal
printItemDescription() - Outputs the item name and description
Ex. of PrintItemCost() output:

Bottled Water 10 @ $1 = $10
Ex. of PrintItemDescription() output:

Bottled Water: Deer Park, 12 oz.
Step 2: Create two new files:
ShoppingCart.java - Class definition
ShoppingCartManager.java - Contains main() method
Build the ShoppingCart class with the following specifications.

Private fields
String customerName - Initialized in default constructor to "none"
String currentDate - Initialized in default constructor to "January 1, 2016"
ArrayList cartItems
Default constructor
Parameterized constructor which takes the customer name and date as parameters (1 pt)
Public member methods
getCustomerName() accessor (1 pt)
getDate() accessor (1 pt)
addItem()
Adds an item to cartItems array. Has a parameter of type ItemToPurchase. Does not return anything.
removeItem()
Removes item from cartItems array. Has a string (an item's name) parameter. Does not return anything.
If item name cannot be found, output a message: Item not found in cart. Nothing removed.
modifyItem()
Modifies an item's description, price, and/or quantity. Has a parameter of type ItemToPurchase. Does not return anything.
If item can be found (by name) in cart, check if parameter has default values for description, price, and quantity. If not, modify item in cart.
If item cannot be found (by name) in cart, output a message: Item not found in cart. Nothing modified.
getNumItemsInCart() (2 pts)
Returns quantity of all items in cart. Has no parameters.
getCostOfCart() (2 pts)
Determines and returns the total cost of items in cart. Has no parameters.
printTotal()
Outputs total of objects in cart.
If cart is empty, output a message: SHOPPING CART IS EMPTY
printDescriptions()
Outputs each item's description.
If cart is empty, output a message: SHOPPING CART IS EMPTY
Ex. of printTotal() output:

John Doe's Shopping Cart - February 1, 2016
Number of Items: 8

Nike Romaleos 2 @ $189 = $378
Chocolate Chips 5 @ $3 = $15
Powerbeats 2 Headphones 1 @ $128 = $128

Total: $521
Ex. of printDescriptions() output:

John Doe's Shopping Cart - February 1, 2016

Item Descriptions
Nike Romaleos: Volt color, Weightlifting shoes
Chocolate Chips: Semi-sweet
Powerbeats 2 Headphones: Bluetooth headphones
Step 3: In main(), prompt the user for a customer's name and today's date. Output the name and date. Create an object of type ShoppingCart. (1 pt)
Ex:

Enter customer's name:
John Doe
Enter today's date:
February 1, 2016

Customer name: John Doe
Today's date: February 1, 2016
Step 4: Implement the following menu functions in the ShoppingCartManager class
printMenu()
Prints the following menu of options to manipulate the shopping cart. (1 pt)
MENU
a - Add item to cart
d - Remove item from cart
c - Change item quantity
i - Output items' descriptions
o - Output shopping cart
q - Quit
executeMenu()
Takes 3 parameters: a character representing the user's choice, a shopping cart, and a Scanner object. Performs the menu options described below in step 5, according to the user's choice. (1 pt)
Step 5: Implement the menu options
Step 5a: In main(), call printMenu() and prompt for the user's choice of menu options. Each option is represented by a single character.

If an invalid character is entered, continue to prompt for a valid choice. When a valid option is entered, execute the option by calling executeMenu(). Then, print the menu and prompt for a new option. Continue until the user enters 'q'. (1 pt)

Hint: Implement Quit before implementing other options.

Ex:

a - Add item to cart
d - Remove item from cart
c - Change item quantity
i - Output items' descriptions
o - Output shopping cart
q - Quit

Choose an option:
Step 5b: Implement "Output shopping cart" menu option in executeMenu(). (3 pts)

Ex:

OUTPUT SHOPPING CART
John Doe's Shopping Cart - February 1, 2016
Number of Items: 8

Nike Romaleos 2 @ $189 = $378
Chocolate Chips 5 @ $3 = $15
Powerbeats 2 Headphones 1 @ $128 = $128

Total: $521
Step 5c: Implement "Output items' descriptions" menu option in executeMenu(). (2 pts)

Ex:

OUTPUT ITEMS' DESCRIPTIONS
John Doe's Shopping Cart - February 1, 2016

Item Descriptions
Nike Romaleos: Volt color, Weightlifting shoes
Chocolate Chips: Semi-sweet
Powerbeats 2 Headphones: Bluetooth headphones
Step 5d: Implement "Add item to cart" menu option in executeMenu(). (3 pts)

Ex:

ADD ITEM TO CART
Enter the item name:
Nike Romaleos
Enter the item description:
Volt color, Weightlifting shoes
Enter the item price:
189
Enter the item quantity:
2
Step 5e: Implement "Remove item from cart" menu option in executeMenu(). (4 pts)

Ex:

REMOVE ITEM FROM CART
Enter name of item to remove:
Chocolate Chips
Step 5f: Implement "Change item quantity" menu option in executeMenu(). (5 pts)

Hint: Make new ItemToPurchase object and use ItemToPurchase modifiers before using modifyItem() method.

Ex:

CHANGE ITEM QUANTITY
Enter the item name:
Nike Romaleos
Enter the new quantity:
3
