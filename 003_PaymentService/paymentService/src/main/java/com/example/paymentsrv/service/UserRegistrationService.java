package com.example.paymentsrv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.paymentsrv.dto.UpdatePaymentUserReq;
import com.example.paymentsrv.exception.UserNotFoundException;
import com.example.paymentsrv.model.Payment;
import com.example.paymentsrv.model.PaymentUser;
import com.example.paymentsrv.repository.UserRegistrationRepository;

@Service
public class UserRegistrationService {
 
    @Autowired
    private final UserRegistrationRepository userRepository;

    public UserRegistrationService(UserRegistrationRepository userRepository) {
        this.userRepository = userRepository;
    }

    public PaymentUser createPaymentUser(PaymentUser user) {
        return userRepository.save(user);
    }

    public PaymentUser updatePaymentUser(UpdatePaymentUserReq userReq) throws UserNotFoundException
    {
        PaymentUser user = userRepository.findByPhoneNo(userReq.getPhoneNo()); 

        if (user == null) {
            throw new UserNotFoundException("User with this phone number not found.");
        }

        // Update user properties with values from the request
        if (userReq.getName() != null) { 
            user.setName(userReq.getName()); 
        }
        if (userReq.getEmail() != null) {
            user.setEmail(userReq.getEmail()); 
        }

        return userRepository.save(user); 
    }

    public PaymentUser findByPhoneNo(String phoneNumber) {
        return userRepository.findByPhoneNo(phoneNumber);
    }


}
