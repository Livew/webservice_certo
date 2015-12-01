package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "hotel", catalog = "booking")
public class Hotel {
	
	private int hotelId;
	private String hotelName;
	private Boolean hotelAvailability;
	private String hotelCity;
	
	public Hotel(){
		
	}
	
	public Hotel(int hotelId, String hotelName, Boolean hotelAvailability){
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.hotelAvailability = hotelAvailability;
	}
	
	@Id
	@Column(name = "hotelId", nullable = false)
	public int getCdPaciente() {
		return this.hotelId;
	}
	
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	@Column(name = "hotelName", nullable = false)
	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	@Type(type = "true_false")
	@Column(name = "hotelAvailability", nullable = false)
	public Boolean getHotelAvailability() {
		return hotelAvailability;
	}

	public void setHotelAvailability(Boolean hotelAvailability) {
		this.hotelAvailability = hotelAvailability;
	}
	
	@Column(name = "hotelCity", nullable = false)
	public String gethotelCity() {
		return hotelCity;
	}

	public void sethotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}
	
	
}
