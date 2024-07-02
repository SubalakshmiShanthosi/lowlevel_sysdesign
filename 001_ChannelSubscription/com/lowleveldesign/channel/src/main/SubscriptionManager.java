
public class SubscriptionManager {
    

     public boolean subscribe(User user, Subscription aSubscription) {
        // Handle subscription logic, including location constraint and balance check

        // Get user current account balance and channel cost - 
       
        //Check if ALL is applicable for channel --> if so then skip location check 

        // If both constraints are met - update userBalance as accbalance - channelcost 
        // Create new subscription and add it to the user subscription list. 

        if(user.getAccountBalance()>= aSubscription.getPrice())
        {
            if(aSubscription.getAllowedLocations().contains("ALL")|| aSubscription.getAllowedLocations().contains(user.getLocation())){
                
                user.setAccountBalance(user.getAccountBalance() - aSubscription.getPrice());
                
                user.addSubscription(aSubscription);

                return true;
            }
        }


        return false;
    }

    public void upgrade(User user, Subscription aSubscription) {
        // Handle upgrade logic, if necessary
        if(user.getAccountBalance() >= aSubscription.getPrice())
        {
           //user.setAccountBalance(user.getAccountBalance()-(aSubscription.getPrice()));
        }
    }
}
