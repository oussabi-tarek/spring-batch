package com.learning.springbatch.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @ToString
    @Table(name = "CUSTOMER")
@Data
public class Customer {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "CUSTOMER_ID")
    private Long id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "Email")
    private String email;
    @Column(name = "Gender")
    private String gender;
    @Column(name = "Contact_No")
    private String contactNo;
        @Column(name = "Country")
    private String country;
    @Column(name = "DOB")
    private String dob;
}
