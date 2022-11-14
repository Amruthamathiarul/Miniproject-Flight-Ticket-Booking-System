package flightticketbooking;

public class Flight_Details {
	String flight_id, flight_name; 
	int price;

	public void addflight(String fid, String fname, int price) {
		flight_id = fid;
		flight_name = fname;
		this.price = price;
	}

	public String getFlight_id() {
		return flight_id;
	}

	public void setFlight_id(String flight_id) {
		this.flight_id = flight_id;
	}

	public String getFlight_name() {
		return flight_name;
	}

	public void setFlight_name(String flight_name) {
		this.flight_name = flight_name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
