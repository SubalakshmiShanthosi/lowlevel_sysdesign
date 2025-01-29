package com.example.paymentsrv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.paymentsrv.model.PaymentUser;
import com.example.paymentsrv.repository.UserRegistrationRepository;

@Service
public class UserRegistrationService {
 
    private final UserRegistrationRepository userRepository;

    @Autowired
    public UserRegistrationService(UserRegistrationRepository userRepository) {
        this.userRepository = userRepository;
    }

    public PaymentUser createPaymentUser(PaymentUser user) {
        return userRepository.save(user);
    }

}
