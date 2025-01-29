package com.example.paymentsrv.repository;
import org.springframework.data.repository.ListCrudRepository;

import com.example.paymentsrv.model.PaymentUser;

import jakarta.validation.Valid;

public interface UserRegistrationRepository extends ListCrudRepository<PaymentUser, Long>{


}
