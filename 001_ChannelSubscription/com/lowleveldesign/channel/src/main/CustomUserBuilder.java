import java.util.List;

public class CustomUserBuilder implements UserBuilder {
    private String name;
    private String location;
    private double accountBalance; 
    private List<Subscription> subscriptions;

    public CustomUserBuilder(String name, double accountBalance)
    {
        this.name=name;
        this.accountBalance = accountBalance;
    }

    public CustomUserBuilder setLocation(String aLocation)
    {
        this.location = aLocation;
        return this;
    }

    public CustomUserBuilder setSubscription(List<Subscription>aSubscription)
    {
        this.subscriptions = aSubscription;
        return this;
    }

    @Override
    public User build() {
        // TODO Auto-generated method stub
        return new User(name, location, accountBalance, subscriptions);
    }
    
}
