package ecommerceapplicationproject;

   public class CreditCard  {
    
    //Declaring variables for the CreditCard class:
    private String creditCardNumber;
    private User creditCardUser;
    private String securityCode;
    private String expirationDate;
    private double creditCardBalance;

    //Constructor:
    public CreditCard(String creditCardNumber, User creditCardUser, String securityCode, String expirationDate,double creditCardBalance) {
       
        this.creditCardNumber = creditCardNumber;
        this.creditCardUser = creditCardUser;
        this.securityCode = securityCode;
        this.expirationDate = expirationDate;
        this.creditCardBalance = creditCardBalance;
    }
    
    //Override method to assist the compiler in catching errors.
    @Override
    public String toString() {
        String maskedNumber = "**** **** **** " + creditCardNumber.substring(creditCardNumber.length() - 4);
        return "Credit Card Number: " + maskedNumber + "\n" +
                "Credit Card User: " + creditCardUser.getName() + " " + creditCardUser.getSurname() + "\n" +
                "Security Code (cvv): ***\n" +
                "Expiration Date: " + expirationDate;
    }
    
    //Getter and Setter methods for the CreditCard class:
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public User getCreditCardUser() {
        return creditCardUser;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public double getCreditCardBalance() {
        return creditCardBalance;
    }
    
    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setCreditCardUser(User creditCardUser) {
        this.creditCardUser = creditCardUser;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setCreditCardBalance(double creditCardBalance) {
        this.creditCardBalance = creditCardBalance;
    }
    
    //Attributes of the CreditCard class:
    public void writeAllAttsCreditCard(){
    
        System.out.println("Credit Card Number : " + this.creditCardNumber);
        System.out.println("Credit Card User : " + this.creditCardUser);
        System.out.println("Security Code : " + this.securityCode);
        System.out.println("Expiration Date : " +this. expirationDate);
        System.out.println("Credit Card Balance : " + this.creditCardBalance);
                
    } 
}