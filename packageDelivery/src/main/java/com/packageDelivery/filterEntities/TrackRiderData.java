/**
 * 
 */
package com.packageDelivery.filterEntities;


import com.packageDelivery.entities.DeliStatus;
import com.packageDelivery.entities.Status;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Acer
 *
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class TrackRiderData {
	private int deliveryId;
	private PreDelivery preDeli;
	private int riderId;
	private int postalCode;
	private double latitude;
	private double longitude;
	private Status status;
	private DeliStatus deliStatus;
}
