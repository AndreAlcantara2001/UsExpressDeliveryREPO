/**
 * 
 */
package com.packageDelivery.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Acer
 *
 */

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	private String name;
	private String email;
	private String password;
	private String address;
	private String phoneNumber;
	
	@Enumerated(EnumType.STRING)
    @Column(nullable = false, columnDefinition = "VARCHAR(255) default 'CUSTOMER'")
	private Role role;

	@JsonIgnore
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "customer")
	private List<Delivery> deliveries;


}
