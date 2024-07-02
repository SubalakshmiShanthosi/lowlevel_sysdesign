import java.util.Arrays;
import java.util.List;

public class Main{

    public static void main(String args[])
    {   
        Subscription aSubscription = new Subscription("PQR Channel", "base", 120, Arrays.asList("ALL"));
        

        User aUser  = new CustomUserBuilder("John Doe", 1000).setLocation("US").setSubscription(Arrays.asList(aSubscription)).build();

        System.out.println("Subscription Name:"+ aUser.getUserName());
    }
}