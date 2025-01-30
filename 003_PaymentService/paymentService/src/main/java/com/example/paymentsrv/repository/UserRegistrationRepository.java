package com.example.paymentsrv.repository;
import java.util.Optional;

import org.springframework.data.repository.ListCrudRepository;

import com.example.paymentsrv.model.PaymentUser;


public interface UserRegistrationRepository extends ListCrudRepository<PaymentUser, Long>{

    PaymentUser findByPhoneNo(String number);

}
