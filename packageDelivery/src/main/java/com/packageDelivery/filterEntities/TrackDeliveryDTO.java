/**
 * 
 */
package com.packageDelivery.filterEntities;

import com.packageDelivery.entities.Delivery;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Acer
 *
 */

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TrackDeliveryDTO {
	private Delivery delivery;
	private String text;
}
