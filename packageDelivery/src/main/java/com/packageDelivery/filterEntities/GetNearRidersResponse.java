/**
 * 
 */
package com.packageDelivery.filterEntities;

import java.util.List;

import com.packageDelivery.entities.Rider;

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
public class GetNearRidersResponse {
	private double pickupLat;
	private double pickupLng;
	private List<Rider> nearRiders;
}
