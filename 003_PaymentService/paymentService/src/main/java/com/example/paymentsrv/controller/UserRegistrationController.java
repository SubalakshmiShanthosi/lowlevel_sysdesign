package com.example.paymentsrv.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.paymentsrv.dto.UpdatePaymentUserReq;
import com.example.paymentsrv.exception.UserNotFoundException;
import com.example.paymentsrv.model.Payment;
import com.example.paymentsrv.model.PaymentUser;
import com.example.paymentsrv.repository.UserRegistrationRepository;
import com.example.paymentsrv.service.UserRegistrationService;

import lombok.RequiredArgsConstructor;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import io.swagger.annotations.ApiResponse;
//import io.swagger.annotations.ApiResponses;
import jakarta.validation.Valid;

import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@RestController
@RequiredArgsConstructor
//@Api(value = "/user", consumes = MediaType.APPLICATION_JSON_VALUE)
public class UserRegistrationController {
	

	@Autowired
	private UserRegistrationService userRegistrationService;

   

	/*@ApiOperation(value = "Create User Registration")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "User created OK"),
			@ApiResponse(code = 400, message = "Bad Request"),
			@ApiResponse(code = 403, message = "Some issue regarding the input will cause the application not to proceed with the operation"),
			@ApiResponse(code = 409, message = "Conflict with the input provide"),
			@ApiResponse(code = 500, message = "Internal Server Error") })*/
	@PostMapping("/user/register")
	public ResponseEntity<PaymentUser> createUser(@RequestBody @Valid PaymentUser userRegUser) {
		return ResponseEntity.ok(userRegistrationService.createPaymentUser(userRegUser));
	}

	@PostMapping("/user/update")
	public ResponseEntity<PaymentUser> updateUser(@RequestBody @Valid UpdatePaymentUserReq entity) throws UserNotFoundException {
		PaymentUser updatedUser = userRegistrationService.updatePaymentUser(entity);
		return ResponseEntity.ok(updatedUser);
	}
	
	
}
