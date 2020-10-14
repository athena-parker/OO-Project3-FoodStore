# OO-Project3-FoodStore

Object-oriented system for a food store

Athena Parker, Kat Edfors

Running instructions: Just enter the number of days to run the program for

Language: Java, Environment: IntelliJ

# Program Description and Assumptions

For our program, we have objects representing our five types of rolls, three types of customers, the store, and some for implementing our Factory, Decorator, and Observer patterns. Our Rolls keep track of their type and price, Customers keep track of their type as well as observe the Store to see whether it is open or not, the Factory creates customers and rolls, and Decorator adds extras to rolls.

Our Store class ties everything together, keeping track of all roll inventories and updating the inventories when rolls are purchased. For each day, it randomly calculates how many of each customer will come, opens the store, and loops through the odrdering process for each customer.

For casual, we calculate how many rolls they will order, then randomly select rolls for them until either they have the number of rolls they have ordered, or we run out of rolls. If we do not have a roll they requested, we just have them request a different one.

For business, we check if we have at least 2 of every roll, and sell it to them if we do. If we do not, they leave.

For catering, they keep asking for rolls until either they have received 15 or we have run out. If we have 5 of the roll they have asked for, we give them 5, otherwise we give them whatever we have left. 

We then close the store and restock the rolls if we have run out. If at any point we completely run out of rolls, the store closes, and all customers (observers of store) are notified.
