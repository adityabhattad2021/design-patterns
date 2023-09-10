## Problem Statement:

You are tasked with creating a simple coffee ordering system in Java using the Factory Pattern. The system should allow customers to order different types of coffee, such as Espresso, Latte, and Cappuccino, each with its own set of ingredients. The Factory Pattern should be used to create instances of these coffee types based on the customer's order, and the program should demonstrate the following:

1. Define an abstract Coffee class with properties like name and ingredients.
2. Implement concrete subclasses for different coffee types (Espresso, Latte, Cappuccino), each with its own set of ingredients.
3. Create a CoffeeFactory class responsible for instantiating the appropriate coffee type based on user input.
4. The program should take user input for the desired coffee type and then use the CoffeeFactory to create and display the chosen coffee with its ingredients.