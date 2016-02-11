/**
 * 
 */
package com.my.around.data;

import java.math.BigDecimal;

import org.joda.time.DateTime;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

/**
 * @author Sky Strider
 *
 */
@Entity
public class Coordinates {
	
	@Id
	private Long id;
	
	private BigDecimal latitude;
	private BigDecimal longitude;
	@Index
	private DateTime timestamp;
	
	public Coordinates() {
		timestamp = DateTime.now();//TODO we need the timezone of the phone
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public BigDecimal getLatitude() {
		return latitude;
	}
	
	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}
	
	public BigDecimal getLongitude() {
		return longitude;
	}
	
	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public DateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(DateTime timestamp) {
		this.timestamp = timestamp;
	}
	
	@Override
	public String toString() {
		return String.format("@%s,%s - (%d)", latitude.toPlainString(), longitude.toPlainString(), id);
	}
	
}
