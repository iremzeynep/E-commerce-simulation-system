package ecommerceapplicationproject;

    public class Product {
        
    //Declaring variables for Product class:
    private String productName;
    private String productColor;
    private String productCategory;
    private int productStock;
    private double productWeight;
    private String productDescription;
    private double productPrice;

    //Constructor
    public Product(String productName, String productColor, String productCategory, int productStock, 
            double productWeight, String productDescription,double productPrice) {
        
        this.productName = productName;
        this.productColor = productColor;
        this.productCategory = productCategory;
        this.productStock = productStock;
        this.productWeight = productWeight;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
    }
    
    //Override method  to assist the compiler in catching errors.
     @Override
    public String toString() {
        return "Product: " +
                "product Name = '" + productName + '\'' +
                ", product Color = '" + productColor + '\'' +
                ", product Category = '" + productCategory + '\'' +
                ", product Stock = " + productStock +
                ", product Weight = " + productWeight +
                ", product Description = '" + productDescription + '\'';
    }
    
    //Getter and Setter methods for Product class:
    public String getProductName() {
        return productName;
    }

    public String getProductColor() {
        return productColor;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public int getProductStock() {
        return productStock;
    }

    public double getProductWeight() {
        return productWeight;
    }

    public double getProductPrice() {
        return productPrice;
    }
    
    public String getProductDescription() {
        return productDescription;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public void setProductWeight(double productWeight) {
        this.productWeight = productWeight;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    
    //Boolean method to reduce the stocks if there is enough stock:
    public boolean reduceStock(int desiredAmount) {
        if (desiredAmount>0 && desiredAmount <= productStock) {
            productStock -= desiredAmount;
            return true; // If there are enough stock
        } else {
            return false; // If there are insufficient stock
        }
    }
    
    //Attributes of the Product class:
    public void writeAllAttsProduct(){
        System.out.println("Product Name : " + this.productName);
        System.out.println("Product Color : " + this.productColor);
        System.out.println("Product Catagory : " + this.productCategory);
        System.out.println("Product Stock : " + this.productStock);
        System.out.println("Product Weight : " + this.productWeight);
        System.out.println("Product Description : " + this.productDescription);
        System.out.println("Product Price : " + this.productPrice);
        
    }
}
     
     
       
        
    
    
            

