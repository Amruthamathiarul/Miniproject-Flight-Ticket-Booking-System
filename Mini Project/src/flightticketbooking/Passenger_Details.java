package flightticketbooking;

public class Passenger_Details {
	String passenger_id, passenger_name;
	int tickets;

	public void addpassenger(String pid, String pname, int tickets) {
		passenger_id = pid;
		passenger_name = pname;
		this.tickets = tickets;
	}

	public String getPassenger_id() {
		return passenger_id;
	}

	public void setPassenger_id(String passenger_id) {
		this.passenger_id = passenger_id;
	}

	public String getPassenger_name() {
		return passenger_name;
	}

	public void setPassenger_name(String passenger_name) {
		this.passenger_name = passenger_name;
	}

	public int getTickets() {
		return tickets;
	}

	public void setTickets(int tickets) {
		this.tickets = tickets;
	}

}
