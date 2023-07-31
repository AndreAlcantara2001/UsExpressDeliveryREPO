/**
 * 
 */
package com.packageDelivery.filterEntities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
public class PreDelivery {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int preDeliId;
	
	private String receiverName;
	private String receiverPhone;
	private double itemWeight;
	private double distance;
	private double cost;
	private double pickupLat;
	private double pickupLng;
	private double destinationLat;
	private double destinationLng;
	private String pickupAddressText;
	private String destinationAddressText;
	private int postalCode;
	private int customerId;
}
