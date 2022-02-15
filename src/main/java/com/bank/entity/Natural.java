package com.bank.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.bank.model.CustomerProfile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "natural")
public class Natural {
	
	@Id
    private String id;
    private String dni;
    private String firstName;
    private String lastName;
    private String email;
    private CustomerProfile profile;
}
