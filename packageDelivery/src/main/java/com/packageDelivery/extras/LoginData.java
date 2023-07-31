/**
 * 
 */
package com.packageDelivery.extras;

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
public class LoginData {

	private String username;
	private String password;
}
