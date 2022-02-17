package com.bank.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "customer")
public class Customer {
	
	@Id
    private String id;
	private String typecustomer;
    private String fullname;
    private String email;
    private String profile;
    private String typedocument;
    private String documentnumber;
}
