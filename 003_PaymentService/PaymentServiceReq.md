# PaymentService Design

Functional Requirements

(1) User Registration to payment service - Allow users to create accounts via their phone number and password.

```rb
            RegisterUser [phone_number] [password]
```

(2) Allow Users to update User Profile details

```rb
            UpdateUser [user_id] [name] [email] [phone_number]
```

(3) Send money to another user of the application. (Send money to another phone number)

```rb
            CreateTransaction BANK [from_user_id] [account_number] [ifsc_code] [amount]
```

(4) Allow users to make payment for the transaction via Card/ UPI/ Netbanking

```rb
            MakePayment [transaction_id] [payment_method] [... details related to payment method ...]
```

(5) Allow users to refund a transaction. The refund amount will go to the original source.

```rb
            RefundTransaction [transaction_id]
```

(6) Allow users to view transaction history

```rb
            ViewTransactionsHistory [user_id]
```
