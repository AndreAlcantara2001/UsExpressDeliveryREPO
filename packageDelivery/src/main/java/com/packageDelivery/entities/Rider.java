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
public class Rider {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int riderId;
	
	private String name;
	private String email;
	private String password;
	private String phoneNumber;
	private String address;
	
	private double latitude;
	private double longitude;
	
	private int postalCode;
	
	private Status status;
	
	private DeliStatus deliStatus;
	
	@Enumerated(EnumType.STRING)
    @Column(nullable = false, columnDefinition = "VARCHAR(255) default 'RIDER'")
	private Role role;

	@JsonIgnore
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "rider")
	private List<Delivery> deliveries;


}
