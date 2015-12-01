package persistence;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import entities.Hotel;

import java.util.ArrayList;
import java.util.List;

public class HotelDAO {

	private Session session;
	
	public void insertHotel(Hotel hotel){
		this.session.save(hotel);
	}
	
	public void updateHotel(Hotel hotel){
		this.session.update(hotel);
	}
	
	public List<Hotel> findHotelAvailable(Boolean availability){
		List<Hotel> hoteis = new ArrayList<Hotel>();
		Criteria criterio = this.session.createCriteria(Hotel.class);
		criterio.add(Restrictions.eq("true", availability));
		hoteis = criterio.list();
		return hoteis;
	}
	
	public List<Hotel> findHotelByCity(String hotelCity){
		List<Hotel> hoteis = new ArrayList<Hotel>();
		Criteria criterio = this.session.createCriteria(Hotel.class);
		criterio.add(Restrictions.eq("hotelCity", hotelCity));
		hoteis = criterio.list();
		return hoteis;
	}
}
