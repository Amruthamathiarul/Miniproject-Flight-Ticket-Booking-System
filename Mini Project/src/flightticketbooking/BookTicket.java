package flightticketbooking;

import java.util.ArrayList;
import java.util.Scanner;

public class BookTicket {
	static String getpname(String pid, ArrayList<Passenger_Details> PassengerList) {

		String pname = "";
		for (int i = 0; i < PassengerList.size(); i++) {
			if (PassengerList.get(i).getPassenger_id().equals(pid)) {
				pname = PassengerList.get(i).getPassenger_name();
				int tickets = PassengerList.get(i).getTickets();
			}
		}

		return pname;
	}

	static int getfprice(String fid, Flight_Details flight) {
		String fname = "";
		int price = 0;

		if (flight.getFlight_id().equals(fid)) {
			fname = flight.getFlight_name();
			price = flight.getPrice();
		}

		System.out.println("Flight ID:" + fid + " Flight Name:" + fname + " Price:" + price);
		System.out.println("-----------------------------------------------------------");
		System.out.println();

		return price;
	}

	public static void main(String[] args) {
		ArrayList<Passenger_Details> PassengerList = new ArrayList<Passenger_Details>();
		ArrayList<Flight_Details> FlightList = new ArrayList<Flight_Details>();
		Flight_Details flight = new Flight_Details();
		flight.addflight("f1", "Indigo", 5000);

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("1.Book tickets, Enter value 1");
			System.out.println("2.Cancel Booked tickets, Enter value 2");
			System.out.println("3.Print booked details, Enter value 3");
			System.out.println("To Exit, Enter value 4");

			System.out.println("Enter your choice::");
			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Passenger Name");
				String passenger_name = scan.next();
				System.out.println("Enter no of tickets");
				int tickets = scan.nextInt();
				String passenger_id = "p" + (PassengerList.size() + 1);
				Passenger_Details p = new Passenger_Details();
				p.addpassenger(passenger_id, passenger_name, tickets);
				PassengerList.add(p);
				System.out.println();
				System.out.println("Welcome " + passenger_name + "-" + passenger_id + ", your ticket price is "
						+ tickets * getfprice("f1", flight));
				System.out.println("-----------------------------------------------------------");
				System.out.println();

				break;
			case 2:
				System.out.println("Enter Passenger ID");
				String pid = scan.next();
				String pname = getpname(pid, PassengerList);
				if (pname.isEmpty()) {
					System.out.println("Passenger ID is invalid");
					System.out.println("-----------------------------------------------------------");
					System.out.println();
					break;
				}
				int i = 0, tick = 0, index = 0;
				for (Passenger_Details d : PassengerList) {
					if (d.getPassenger_id().equals(pid)) {
						tick = d.getTickets();
						index = i;

					}
					i++;

				}
				PassengerList.remove(index);
				System.out.println(pname + ", your " + tick + " tickets has been cancelled");

				break;
			case 3:
				System.out.println("List of Booked tickets");
				System.out.println();
				for (Passenger_Details d : PassengerList) {

					System.out.println("Passenger ID:" + d.getPassenger_id() + " Passenger Name:"
							+ d.getPassenger_name() + " Tickets Booked:" + d.getTickets() + " Price:"
							+ d.getTickets() * getfprice("f1", flight));
					System.out.println("-----------------------------------------------------------");
					System.out.println();

				}
				break;
			case 4:
				System.out.println("Exiting the application");
				System.exit(0);
			default:
				System.out.println("Enter valid choice");
			}
		}

	}

}
