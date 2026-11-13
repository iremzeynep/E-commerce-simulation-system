package ecommerceapplicationproject;

public class EcommerceApplicationProject {
  
    public static void main(String[] args) {
        
       // 1. Declare Users: 
      User user1 = new User("lulu", "Eylül", "Bahçeci", "05/09/2005", "123456", "eylulubahceci@oop.com", "Defne/Hatay", "hacettepe");
      User user2 = new User("kole", "Andrea Ramazan", "Yıldırım", "10/07/2007", "789012", "koleyildirim@oop.com", "Ceyhan/Adana", "ual");
      
      // 2. Declare Credit Cards:
      CreditCard creditCard1 = new CreditCard("5935455935455935", user1, "121", "10/29", 8000);
      CreditCard creditCard2 = new CreditCard("1535451535451535", user2, "222", "05/27", 15000);
      
      // 3. Add the credit cards into users' registered credit cards:
      user1.getCreditCards().add(creditCard1);
      user2.getCreditCards().add(creditCard2);
      
      // 4. Print all attributes of the users:
      System.out.println("--- User Profiles ---");
      user1.writeAllAttsUser();
      user2.writeAllAttsUser();
      
      // 5. Declare Products:
      Product pc = new Product("Computer", "Black", "Electronic Devices", 60, 2.5, "Laptop", 56000);
      Product phone = new Product("Phone", "Green", "Electronic Devices", 100, 0.7, "Smartphone", 50000);
      Product dress = new Product("Dress", "Lilac", "Clothes", 10000, 0.5, "Maxi Dress", 1000);
      Product bag = new Product("Bag", "Brown", "Accessories", 7, 0.8, "Special Collection: Boston Bag", 10000);
      Product lego = new Product("Lego", "Red, Green", "Hobby", 1000, 1, "Lego Icons Bouquet Of Roses", 3200);
      Product pen = new Product("Pen", "Blue", "Stationery", 90000, 0.1, "Signature Pen", 200);
      
      // 6. Add and remove products from favorite lists:
      System.out.println("--- Favorite List Actions ---");
      user1.addToFavoriteProducts(phone);
      user1.addToFavoriteProducts(pc);
      user1.deleteFavoriteProducts(pc); // Testing removal
      user1.addToFavoriteProducts(lego);
      user1.addToFavoriteProducts(pen);
      
      user2.addToFavoriteProducts(dress);
      user2.addToFavoriteProducts(bag);
      user2.addToFavoriteProducts(lego);
      user2.deleteFavoriteProducts(dress); // Testing removal
      
      // Print Favorite Lists:
      System.out.println("\n" + user1.getUsername() + "'s favorite product list:");
      user1.favoriteProductList(user1);
      System.out.println("\n" + user2.getUsername() + "'s favorite product list:");
      user2.favoriteProductList(user2);
        
      // 7. Process Orders:
      System.out.println("\n--- Order Processing ---");
      Order order1 = new Order(user1, phone, creditCard1);
      order1.processOrder(2);

      Order order2 = new Order(user1, lego, creditCard1);
      order2.processOrder(1);
        
      Order order3 = new Order(user2, bag, creditCard2);
      order3.processOrder(1);
        
      Order order4 = new Order(user1, pen, creditCard1);
      order4.processOrder(5);
        
      // 8. Remaining product stocks after the orders: 
      System.out.println("\n--- Remaining Stocks ---");
      System.out.println(pc.getProductName() + ": " + pc.getProductStock());
      System.out.println(phone.getProductName() + ": " + phone.getProductStock());
      System.out.println(dress.getProductName() + ": " + dress.getProductStock());
      System.out.println(bag.getProductName() + ": " + bag.getProductStock());
      System.out.println(lego.getProductName() + ": " + lego.getProductStock());
      System.out.println(pen.getProductName() + ": " + pen.getProductStock());
    }
}