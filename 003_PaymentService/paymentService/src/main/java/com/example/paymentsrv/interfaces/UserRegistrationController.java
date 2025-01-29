package com.example.paymentsrv.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.paymentsrv.model.PaymentUser;
import com.example.paymentsrv.repository.UserRegistrationRepository;
import com.example.paymentsrv.service.UserRegistrationService;

import lombok.RequiredArgsConstructor;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import io.swagger.annotations.ApiResponse;
//import io.swagger.annotations.ApiResponses;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@RestController
@RequiredArgsConstructor
//@Api(value = "/user", consumes = MediaType.APPLICATION_JSON_VALUE)
public class UserRegistrationController {
    

	@Autowired
    private UserRegistrationService userRegistrationService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello from the controller!";
    }

    /*@ApiOperation(value = "Create User Registration")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "User created OK"),
			@ApiResponse(code = 400, message = "Bad Request"),
			@ApiResponse(code = 403, message = "Some issue regarding the input will cause the application not to proceed with the operation"),
			@ApiResponse(code = 409, message = "Conflict with the input provide"),
			@ApiResponse(code = 500, message = "Internal Server Error") })*/
	@PostMapping("/register")
	public ResponseEntity<PaymentUser> create(@RequestBody @Valid PaymentUser userRegUser) {
		return ResponseEntity.ok(userRegistrationService.createPaymentUser(userRegUser));
	}
}
