/**
 * 
 */
package com.packageDelivery.filterEntities;

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
public class ConfirmDelivery {

	private int preDeliId;
	private int riderId;
}
