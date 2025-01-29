package com.example.paymentsrv.model;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Entity
@Table(name = "paymentUser")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "phone_no", unique = true)
    private String phoneNo;

    @Column(name = "password")
    private String password;

    @Column(name = "name",nullable = true)
    private String name;

    @Column(name = "email",nullable = true)
    private String email;

    @Column(name = "balance",nullable = true)
    private BigDecimal balance;
}
