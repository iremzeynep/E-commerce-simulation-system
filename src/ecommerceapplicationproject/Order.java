package ecommerceapplicationproject;

   public class Order {
    //Declaring variables of the Order class:
    private User user;
    private Product product;
    private CreditCard creditCard;

    //Constructor:
    public Order(User user, Product product, CreditCard creditCard) {
        this.user = user;
        this.product = product;
        this.creditCard = creditCard;
        
    }
        
    //Override method  to assist the compiler in catching errors.
    @Override
    public String toString() {
        return "Order{" +
                "user=" + user.getUsername() +
                ", product=" + product.getProductName() +
                ", creditCard=" + "**** **** **** " + creditCard.getCreditCardNumber().substring(creditCard.getCreditCardNumber().length() - 4) +
                '}';
    }
   
    //Getter and setter methods for the Order class:
    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
    
    public boolean processOrder(int desiredAmount) {
        double totalPrice=product.getProductPrice()*desiredAmount;
        if(totalPrice <= creditCard.getCreditCardBalance()){
           
            if (product.reduceStock(desiredAmount)) {
             creditCard.setCreditCardBalance(creditCard.getCreditCardBalance() - totalPrice);   
             user.getProductsOrdered().add(product); 
              System.out.println(user.getUsername() + " There is enough stock for : " + product.getProductName());
              System.out.println("Your order has been successfully received for the product " + product.getProductName());
            return true;
            }
            else{
              System.out.println(user.getUsername() + " We are sorry...We couldnt receive your order" +
                    "Insufficient stock for product " +
                    product.getProductName());
            return false;
            }
          
        }
            else {
            System.out.println("\n" + user.getUsername() +" We couldn't get your payment for " + product.getProductName() + ". Please check your balance.");
        return false;
        }
      }
      //Attributes of the Order class:
       public void writeAllAttsOrder(){
        System.out.println("Ordered by : " + this.getUser());
        System.out.println("Ordered Product : " + this.getProduct());
        System.out.println("Means of Payment : " + this.getCreditCard());
    }
}