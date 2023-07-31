/**
 * 
 */
package com.packageDelivery.entities;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


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
public class Delivery {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int deliveryId;
	
	@Column(nullable = false)
	private String receiverName;
	
	@Column(nullable = false)
	private String receiverPhone;
	
	@Column(nullable = false)
	private double itemWeight;
	
	@Column(nullable = false)
	private double distance;
	
	@Column(nullable = true)
	private double cost;
	
	@Column(nullable = false)
	private double pickupLat;
	
	@Column(nullable = false)
	private double pickupLng;
	
	@Column(nullable = false)
	private double destinationLat;
	@Column(nullable = false)
	private double destinationLng;
	
	@Column(nullable = true)
	private String pickupAddressText;
	
	@Column(nullable = true)
	private String destinationAddressText;
	
	@Column(nullable = false)
	private int postalCode;//postal code of pickup address
	
	@Column(nullable = true, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime createdAt;
	
	private ConfirmDeliveryStatus cdStatus;
	
	//join customer
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="customer_id", referencedColumnName = "customerId")
	private Customer customer;
	
	//join rider
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "rider_id", referencedColumnName = "riderId")
	private Rider rider;
	
	

}
