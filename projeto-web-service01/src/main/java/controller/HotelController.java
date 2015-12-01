package controller;

import entities.Hotel;

public class HotelController {

	private Hotel hotel;
	
	public void setHotelAvailableToFalse(){
		this.hotel.setHotelAvailability(false);
	}
	
	public void setHotelAvailableToTrue(){
		this.hotel.setHotelAvailability(true);
	}
	
}
