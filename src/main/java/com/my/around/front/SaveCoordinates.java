/**
 * 
 */
package com.my.around.front;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;
import com.my.around.data.ApplicationObjectifyService;
import com.my.around.data.Coordinates;

/**
 * @author Sky Strider
 *
 */
@Api(name = "around",
	version = "v1.0.4",
	namespace = @ApiNamespace(ownerDomain = "around-my.appspot.com",
								ownerName = "around-my.appspot.com",
								packagePath="around.data"))
public class SaveCoordinates {
	final static Logger logger = LogManager.getLogger(SaveCoordinates.class);
	
	@ApiMethod(name = "saveCoordinates", httpMethod = "POST")
	public void saveCoordinates(@Named("latitude")String latitude, @Named("longitude")String longitude) {
		Coordinates coordinates = null;
		
		logger.debug("Handling request to save coordinates");
		
		BigDecimal latitudeExact = parseStringNumber(latitude);
		BigDecimal longitudeExact = parseStringNumber(longitude);
		
		if( latitudeExact != null && longitudeExact != null ) {
			coordinates = new Coordinates();
			coordinates.setLatitude(latitudeExact);
			coordinates.setLongitude(longitudeExact);
			
			//save to data layer
			logger.debug("Saving coordinates");
			ApplicationObjectifyService.ofy().save().entity(coordinates);
		}
	}
	
	private BigDecimal parseStringNumber(String number) {
		DecimalFormat formater = new DecimalFormat();
		formater.setParseBigDecimal(true);
		
		BigDecimal value = null;
		try {
			value = (BigDecimal) formater.parse(number);
		} catch (ParseException e) {
			logger.error("Failed to parse " + number + "to BigDecimal.", e);
		}
		
		return value;
	}
}
