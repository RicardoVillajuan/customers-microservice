package com.bank.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.bank.model.Holders;
import com.bank.model.Signatories;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "enterprise")
public class Enterprise {
	
	@Id
	private String id;
	private String name;
	private String ruc;
	private String type;
	private String profile;
	
}
