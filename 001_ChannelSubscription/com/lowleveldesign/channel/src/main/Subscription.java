import java.util.List;

public class Subscription {
    private String channelName;
    private String type; 
    private double price; 

    private List<String> allowedLocations;

    // Constructor
    public Subscription(String channelName, String type, double price, List<String> allowedLocations) {
        this.channelName = channelName;
        this.type = type;
        this.price = price;
        this.allowedLocations = allowedLocations;
    }

    public double getPrice()
    {
        return price; 
    }

    public String getChannelName()
    {
        return channelName;
    }

    public List<String> getAllowedLocations()
    {
        return allowedLocations;
    }

    
}
