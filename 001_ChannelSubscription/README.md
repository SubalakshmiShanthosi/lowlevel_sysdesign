# Channel Subscription (TDD) way

As a cable TV operator, A subscriber should be given ability to -
    1. Subscribe to a new channel.
    2. Upgrade the package of existing subscribed channel.

Constraints for this problem - Make sure the user maintains minimum balance, Subscription would alter the balance, Upgrade should alter the balance, location based subscription (subscription is possible based on the region of the channel).

Sample data - 
User - John Doe ( Balance 1000)
        Location - USA
       Current Subscription - PQR(Base)

Channels List
    Channel ABC (USA and Canada Only) 
        Base - 120
        SD - 130
        HD - 150
        4k - 200

    Channel PQR (All Locations)
        Base - 120
        SD - 130 


Input prompt: 
Do you want to subscribe or upgrade?
Subscribe
Enter Channel Name
ABC
Please choose subscription type: (Base, SD, HD, 4k)
4k
O/p:
Channel ABC (4k) subscribed successfully.
Available account balance: 800 INR
Continue? <y/n>
Y
Input:
Do you want to subscribe or upgrade?
Upgrade
Enter Channel Name
PQR
Please choose subscription type: (Base, SD)
SD
O/p:
Channel PQR (SD) subscribed successfully.
Available account balance: 790 IN