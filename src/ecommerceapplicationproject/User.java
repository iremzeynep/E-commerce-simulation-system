package ecommerceapplicationproject;

import java.util.ArrayList;

public class User  {
    
    private String username;
    private String name;
    private String surname;
    private String dateOfBirth;
    private String password;
    private String eMailAddress;
    private String homeAddress;
    private String workAddress;
    private ArrayList<CreditCard> creditCards; // İsim çoğul yapıldı (Clean Code)
    private ArrayList<Product> productsOrdered;
    private ArrayList<Product> favoriteProducts;
    
    //The constructor:
    public User(String username,String name,String surname,String dateOfBirth,String password,String eMailAddress,String homeAddress,String workAddress){
        this.username=username;
        this.name=name;
        this.surname=surname;
        this.dateOfBirth=dateOfBirth;
        this.password=password;
        this.eMailAddress=eMailAddress;
        this.homeAddress=homeAddress;
        this.workAddress=workAddress;
        this.productsOrdered=new ArrayList<>();
        this.favoriteProducts=new ArrayList<>();
        this.creditCards=new ArrayList<>(); // Güncellendi
    }
    
    //Override method to assist the compiler in catching errors.
    @Override
    public String toString() {
        return "User{" + "username=" + username + 
                ", name=" + name + 
                ", surname=" + surname + 
                ", dateOfBirth=" + dateOfBirth + 
                ", password=******" + // Şifre maskelendi
                ", eMailAddress=" + eMailAddress + 
                ", homeAddress=" + homeAddress + 
                ", workAddress=" + workAddress + 
                ", productsOrdered=" + productsOrdered + 
                ", favoriteProducts=" + favoriteProducts + 
                ", creditCards=" + creditCards; // Güncellendi
    }
    
    //Getter and Setter methods for the User class:
    public String getUsername() { return username; }
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public String getDateOfBirth() { return dateOfBirth; }
    public String getPassword() { return password; }
    public String geteMailAddress() { return eMailAddress; }
    public String getHomeAddress() { return homeAddress; }
    public String getWorkAddress() { return workAddress; }
    public ArrayList<Product> getProductsOrdered() { return productsOrdered; }
    public ArrayList<Product> getFavoriteProducts() { return favoriteProducts; }
    public ArrayList<CreditCard> getCreditCards() { return creditCards; } // Güncellendi

    public void setUsername(String username) { this.username = username; }
    public void setName(String name) { this.name = name; }
    public void setSurname(String surname) { this.surname = surname; }
    public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public void setPassword(String password) { this.password = password; }
    public void seteMailAddress(String eMailAddress) { this.eMailAddress = eMailAddress; }
    public void setHomeAddress(String homeAddress) { this.homeAddress = homeAddress; }
    public void setWorkAddress(String workAddress) { this.workAddress = workAddress; }
    public void setProductsOrdered(ArrayList<Product> productsOrdered) { this.productsOrdered = productsOrdered; }
    public void setFavoriteProducts(ArrayList<Product> favoriteProducts) { this.favoriteProducts = favoriteProducts; }
    public void setCreditCards(ArrayList<CreditCard> creditCards) { this.creditCards = creditCards; } // Güncellendi
    
    //A method to add products to favorite products list:
    public void addToFavoriteProducts (Product product){
        this.favoriteProducts.add(product);
        System.out.println("This product has been added to " + this.username + "'s favorite list: " + product.getProductName());
    }
    
    //A method to delete products from favorite 
    public void deleteFavoriteProducts(Product product){
        this.favoriteProducts.remove(product);
        System.out.println("This product has been removed from " + this.username + "'s favorite list: " + product.getProductName());
    }
    
    // Kullanılmayan hatalı sipariş metodu tamamen silindi. 
    // İşlem artık profesyonelce Order.java üzerinden dönüyor.
      
    //Users Favorite product list
    public void favoriteProductList(User user){
        for(int i=0; i<this.getFavoriteProducts().size(); i++){
            System.out.println(favoriteProducts.get(i));
        }
    }
      
    //Attributes of the User class:
    public void writeAllAttsUser(){
        System.out.println("Username : " + this.username);
        System.out.println("Name : " + this.name);
        System.out.println("Surname : " +  this.surname);
        System.out.println("Birthday : " + this.dateOfBirth);
        System.out.println("Password : ******"); // Şifre maskelendi
        System.out.println("E-mail Address : " + this.eMailAddress);
        System.out.println("Home Address : " + this.homeAddress);
        System.out.println("Work Address : " + this.workAddress);
        System.out.println("Registered Credit Cards : " + this.creditCards + "\n"); // Güncellendi
    }
}