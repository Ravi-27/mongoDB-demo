package com.example.mongoDb.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document(collection = "customer")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {

	/*
	 * @Id
	 * 
	 * @Generated private Integer id;
	 */
	private String firstName;
	private String lastName;
	private String dlNumber;
	private String zipcode;
}
