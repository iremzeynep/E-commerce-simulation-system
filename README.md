# Console E-Commerce Simulation System

*Note: This project was developed as part of a university group assignment to demonstrate practical knowledge of Object-Oriented Programming (OOP) principles, class relationships, and clean code practices in Java.*

A robust, console-based Java application that simulates the core business logic of an E-Commerce platform. The project models the interactions between Users, Products, Credit Cards, and Orders, enforcing strict data encapsulation and simulating real-world scenarios like stock reduction, balance validation, and data masking.

## Core Features

* **User Management:** Detailed user profiles tracking personal information, registered credit cards, order history, and favorite product lists.
* **Product Catalog:** Product models containing detailed attributes like category, color, weight, price, and dynamic stock levels.
* **Secure Order Processing:** A dedicated `Order` logic that validates credit card balances against the total price and dynamically reduces product stock upon successful transactions.
* **Security & Clean Code:** Sensitive user data (Passwords, Credit Card Numbers, and CVVs) are properly masked in object string representations to simulate real-world security best practices.
* **Console Testing Simulation:** A comprehensive main method that thoroughly tests user creations, favorite list modifications, and multiple order scenarios with varying stock and balance outcomes.

## Technical Architecture

* **Language:** Java (JDK 8+)
* **OOP Concepts Used:** Encapsulation, Composition, Class Overriding (`toString`), Modularity
* **Collections:** `ArrayList` (for tracking user's favorite products, registered cards, and past orders)

## How to Run the Application

1. Clone this repository to your local machine.
2. Ensure you have the Java Development Kit (JDK) installed.
3. Open the project in your preferred Java IDE (such as NetBeans, IntelliJ IDEA, or Eclipse).
4. Run the `EcommerceApplicationProject.java` file.
5. Review the console output to observe the simulated order processing, stock reductions, and favorite list management in action.
```[cite: 42, 43, 44, 45, 46]
