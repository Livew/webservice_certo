package services;


import entities.Hotel;
import persistence.HotelDAO;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


public class HotelService {

	private HotelDAO hotelDAO;
	
	public HotelService(){
		
	}
	
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    public void updateAvailability(Hotel hotel){
    	this.hotelDAO.updateHotel(hotel);
    }
	
    @GET
    @Path("{hotelId}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Hotel> findAvailable(@PathParam("hotelId") Integer hotelId, @PathParam("hotelAvailability") Boolean hotelAvailability) {
        return this.hotelDAO.findHotelAvailable(hotelAvailability);
    }
    
    @GET
    @Path("{hotelId}/{hotelCity}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Hotel> findByCity(@PathParam("hotelId") Integer hotelId, @PathParam("hotelCity") String hotelCity){
    	return this.hotelDAO.findHotelByCity(hotelCity);
    }
    
}
