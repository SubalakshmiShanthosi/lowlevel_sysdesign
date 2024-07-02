import java.util.List; 


public class User {
    
    private String name;
    private String location;
    private double accountBalance; 
    private List<Subscription> subscriptions;


    // Constructor
    public User(String name, String location, double accountBalance, List<Subscription> subscriptions) {
        this.name = name;
        this.location = location;
        this.accountBalance = accountBalance;
        this.subscriptions = subscriptions;
    }

    public String getUserName()
    {
        return this.name;
    }

    public double getAccountBalance(){
        return accountBalance;
    }

    public String getLocation()
    {
        return location;
    }

    public void setAccountBalance(double newBalance)
    {
        accountBalance = newBalance;
    }

    public void addSubscription(Subscription aSubscription)
    {
        subscriptions.add(aSubscription);
    }
}
