package com.example.paymentsrv.dto;
import lombok.Data;

@Data
public class UpdatePaymentUserReq {
 
    private String name;
    private String email;
    private String phoneNo;

}
