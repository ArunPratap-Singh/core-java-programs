package immutableClassProgram;

public class FlightDriver {

	public static void main(String[] args) {

		Flight f1 = new Flight(101, "AI101", "Air India", "Delhi", "Mumbai", 8500.00, "Domestic");
		Flight f2 = new Flight(102, "6E202", "IndiGo", "Mumbai", "Bangalore", 6200.00, "Domestic");
		Flight f3 = new Flight(103, "UK303", "Vistara", "Delhi", "Bangalore", 7800.50, "Domestic");
		Flight f4 = new Flight(104, "SG404", "SpiceJet", "Kolkata", "Delhi", 5900.00, "Domestic");
		Flight f5 = new Flight(105, "AI505", "Air India", "Mumbai", "Chennai", 7200.75, "Domestic");
		Flight f6 = new Flight(106, "6E606", "IndiGo", "Hyderabad", "Delhi", 6800.00, "Domestic");
		Flight f7 = new Flight(107, "UK707", "Vistara", "Bangalore", "Kolkata", 8100.25, "Domestic");
		Flight f8 = new Flight(108, "SG808", "SpiceJet", "Delhi", "Goa", 5400.00, "Domestic");
		Flight f9 = new Flight(109, "AI909", "Air India", "Chennai", "Delhi", 7600.50, "Domestic");
		Flight f10 = new Flight(110, "6E1010", "IndiGo", "Pune", "Mumbai", 4500.00, "Domestic");
		Flight f11 = new Flight(111, "AI111", "Air India", "Delhi", "London", 55000.00, "International");
		Flight f12 = new Flight(112, "6E212", "IndiGo", "Mumbai", "Dubai", 28000.50, "International");
		Flight f13 = new Flight(113, "UK313", "Vistara", "Delhi", "Singapore", 32000.00, "International");
		Flight f14 = new Flight(114, "AI414", "Air India", "Mumbai", "New York", 65000.75, "International");
		Flight f15 = new Flight(115, "SG515", "SpiceJet", "Delhi", "Bangkok", 24000.00, "International");
		Flight f16 = new Flight(116, "6E616", "IndiGo", "Delhi", "Kathmandu", 18000.25, "International");
		Flight f17 = new Flight(117, "AI717", "Air India", "Bangalore", "Paris", 58000.00, "International");
		Flight f18 = new Flight(118, "UK818", "Vistara", "Delhi", "Frankfurt", 52000.50, "International");
		Flight f19 = new Flight(119, "AI919", "Air India", "Mumbai", "Sydney", 72000.00, "International");
		Flight f20 = new Flight(120, "6E2020", "IndiGo", "Delhi", "Doha", 26000.75, "International");

		
		System.out.println("==========================Flight Details 1================================");
		System.out.println("ObjectReference is: " + f1);
		System.out.println("Flight Id is: " + f1.getFlightId());
		System.out.println("Flight Number is: " + f1.getFlightNumber());
		System.out.println("Airline Name is: " + f1.getAirlineName());
		System.out.println("Source is: " + f1.getSource());
		System.out.println("Destination is: " + f1.getDestination());
		System.out.println("Ticket Price is: " + f1.getTicketPrice());
		System.out.println("Flight Type is: " + f1.getFlightType());


		System.out.println("==========================Flight Details 2================================");
		System.out.println("ObjectReference is: " + f2);
		System.out.println("Flight Id is: " + f2.getFlightId());
		System.out.println("Flight Number is: " + f2.getFlightNumber());
		System.out.println("Airline Name is: " + f2.getAirlineName());
		System.out.println("Source is: " + f2.getSource());
		System.out.println("Destination is: " + f2.getDestination());
		System.out.println("Ticket Price is: " + f2.getTicketPrice());
		System.out.println("Flight Type is: " + f2.getFlightType());


		System.out.println("==========================Flight Details 3================================");
		System.out.println("ObjectReference is: " + f3);
		System.out.println("Flight Id is: " + f3.getFlightId());
		System.out.println("Flight Number is: " + f3.getFlightNumber());
		System.out.println("Airline Name is: " + f3.getAirlineName());
		System.out.println("Source is: " + f3.getSource());
		System.out.println("Destination is: " + f3.getDestination());
		System.out.println("Ticket Price is: " + f3.getTicketPrice());
		System.out.println("Flight Type is: " + f3.getFlightType());


		System.out.println("==========================Flight Details 4================================");
		System.out.println("ObjectReference is: " + f4);
		System.out.println("Flight Id is: " + f4.getFlightId());
		System.out.println("Flight Number is: " + f4.getFlightNumber());
		System.out.println("Airline Name is: " + f4.getAirlineName());
		System.out.println("Source is: " + f4.getSource());
		System.out.println("Destination is: " + f4.getDestination());
		System.out.println("Ticket Price is: " + f4.getTicketPrice());
		System.out.println("Flight Type is: " + f4.getFlightType());


		System.out.println("==========================Flight Details 5================================");
		System.out.println("ObjectReference is: " + f5);
		System.out.println("Flight Id is: " + f5.getFlightId());
		System.out.println("Flight Number is: " + f5.getFlightNumber());
		System.out.println("Airline Name is: " + f5.getAirlineName());
		System.out.println("Source is: " + f5.getSource());
		System.out.println("Destination is: " + f5.getDestination());
		System.out.println("Ticket Price is: " + f5.getTicketPrice());
		System.out.println("Flight Type is: " + f5.getFlightType());


		System.out.println("==========================Flight Details 6================================");
		System.out.println("ObjectReference is: " + f6);
		System.out.println("Flight Id is: " + f6.getFlightId());
		System.out.println("Flight Number is: " + f6.getFlightNumber());
		System.out.println("Airline Name is: " + f6.getAirlineName());
		System.out.println("Source is: " + f6.getSource());
		System.out.println("Destination is: " + f6.getDestination());
		System.out.println("Ticket Price is: " + f6.getTicketPrice());
		System.out.println("Flight Type is: " + f6.getFlightType());


		System.out.println("==========================Flight Details 7================================");
		System.out.println("ObjectReference is: " + f7);
		System.out.println("Flight Id is: " + f7.getFlightId());
		System.out.println("Flight Number is: " + f7.getFlightNumber());
		System.out.println("Airline Name is: " + f7.getAirlineName());
		System.out.println("Source is: " + f7.getSource());
		System.out.println("Destination is: " + f7.getDestination());
		System.out.println("Ticket Price is: " + f7.getTicketPrice());
		System.out.println("Flight Type is: " + f7.getFlightType());


		System.out.println("==========================Flight Details 8================================");
		System.out.println("ObjectReference is: " + f8);
		System.out.println("Flight Id is: " + f8.getFlightId());
		System.out.println("Flight Number is: " + f8.getFlightNumber());
		System.out.println("Airline Name is: " + f8.getAirlineName());
		System.out.println("Source is: " + f8.getSource());
		System.out.println("Destination is: " + f8.getDestination());
		System.out.println("Ticket Price is: " + f8.getTicketPrice());
		System.out.println("Flight Type is: " + f8.getFlightType());


		System.out.println("==========================Flight Details 9================================");
		System.out.println("ObjectReference is: " + f9);
		System.out.println("Flight Id is: " + f9.getFlightId());
		System.out.println("Flight Number is: " + f9.getFlightNumber());
		System.out.println("Airline Name is: " + f9.getAirlineName());
		System.out.println("Source is: " + f9.getSource());
		System.out.println("Destination is: " + f9.getDestination());
		System.out.println("Ticket Price is: " + f9.getTicketPrice());
		System.out.println("Flight Type is: " + f9.getFlightType());


		System.out.println("==========================Flight Details 10================================");
		System.out.println("ObjectReference is: " + f10);
		System.out.println("Flight Id is: " + f10.getFlightId());
		System.out.println("Flight Number is: " + f10.getFlightNumber());
		System.out.println("Airline Name is: " + f10.getAirlineName());
		System.out.println("Source is: " + f10.getSource());
		System.out.println("Destination is: " + f10.getDestination());
		System.out.println("Ticket Price is: " + f10.getTicketPrice());
		System.out.println("Flight Type is: " + f10.getFlightType());


		System.out.println("==========================Flight Details 11================================");
		System.out.println("ObjectReference is: " + f11);
		System.out.println("Flight Id is: " + f11.getFlightId());
		System.out.println("Flight Number is: " + f11.getFlightNumber());
		System.out.println("Airline Name is: " + f11.getAirlineName());
		System.out.println("Source is: " + f11.getSource());
		System.out.println("Destination is: " + f11.getDestination());
		System.out.println("Ticket Price is: " + f11.getTicketPrice());
		System.out.println("Flight Type is: " + f11.getFlightType());


		System.out.println("==========================Flight Details 12================================");
		System.out.println("ObjectReference is: " + f12);
		System.out.println("Flight Id is: " + f12.getFlightId());
		System.out.println("Flight Number is: " + f12.getFlightNumber());
		System.out.println("Airline Name is: " + f12.getAirlineName());
		System.out.println("Source is: " + f12.getSource());
		System.out.println("Destination is: " + f12.getDestination());
		System.out.println("Ticket Price is: " + f12.getTicketPrice());
		System.out.println("Flight Type is: " + f12.getFlightType());


		System.out.println("==========================Flight Details 13================================");
		System.out.println("ObjectReference is: " + f13);
		System.out.println("Flight Id is: " + f13.getFlightId());
		System.out.println("Flight Number is: " + f13.getFlightNumber());
		System.out.println("Airline Name is: " + f13.getAirlineName());
		System.out.println("Source is: " + f13.getSource());
		System.out.println("Destination is: " + f13.getDestination());
		System.out.println("Ticket Price is: " + f13.getTicketPrice());
		System.out.println("Flight Type is: " + f13.getFlightType());


		System.out.println("==========================Flight Details 14================================");
		System.out.println("ObjectReference is: " + f14);
		System.out.println("Flight Id is: " + f14.getFlightId());
		System.out.println("Flight Number is: " + f14.getFlightNumber());
		System.out.println("Airline Name is: " + f14.getAirlineName());
		System.out.println("Source is: " + f14.getSource());
		System.out.println("Destination is: " + f14.getDestination());
		System.out.println("Ticket Price is: " + f14.getTicketPrice());
		System.out.println("Flight Type is: " + f14.getFlightType());


		System.out.println("==========================Flight Details 15================================");
		System.out.println("ObjectReference is: " + f15);
		System.out.println("Flight Id is: " + f15.getFlightId());
		System.out.println("Flight Number is: " + f15.getFlightNumber());
		System.out.println("Airline Name is: " + f15.getAirlineName());
		System.out.println("Source is: " + f15.getSource());
		System.out.println("Destination is: " + f15.getDestination());
		System.out.println("Ticket Price is: " + f15.getTicketPrice());
		System.out.println("Flight Type is: " + f15.getFlightType());


		System.out.println("==========================Flight Details 16================================");
		System.out.println("ObjectReference is: " + f16);
		System.out.println("Flight Id is: " + f16.getFlightId());
		System.out.println("Flight Number is: " + f16.getFlightNumber());
		System.out.println("Airline Name is: " + f16.getAirlineName());
		System.out.println("Source is: " + f16.getSource());
		System.out.println("Destination is: " + f16.getDestination());
		System.out.println("Ticket Price is: " + f16.getTicketPrice());
		System.out.println("Flight Type is: " + f16.getFlightType());


		System.out.println("==========================Flight Details 17================================");
		System.out.println("ObjectReference is: " + f17);
		System.out.println("Flight Id is: " + f17.getFlightId());
		System.out.println("Flight Number is: " + f17.getFlightNumber());
		System.out.println("Airline Name is: " + f17.getAirlineName());
		System.out.println("Source is: " + f17.getSource());
		System.out.println("Destination is: " + f17.getDestination());
		System.out.println("Ticket Price is: " + f17.getTicketPrice());
		System.out.println("Flight Type is: " + f17.getFlightType());


		System.out.println("==========================Flight Details 18================================");
		System.out.println("ObjectReference is: " + f18);
		System.out.println("Flight Id is: " + f18.getFlightId());
		System.out.println("Flight Number is: " + f18.getFlightNumber());
		System.out.println("Airline Name is: " + f18.getAirlineName());
		System.out.println("Source is: " + f18.getSource());
		System.out.println("Destination is: " + f18.getDestination());
		System.out.println("Ticket Price is: " + f18.getTicketPrice());
		System.out.println("Flight Type is: " + f18.getFlightType());


		System.out.println("==========================Flight Details 19================================");
		System.out.println("ObjectReference is: " + f19);
		System.out.println("Flight Id is: " + f19.getFlightId());
		System.out.println("Flight Number is: " + f19.getFlightNumber());
		System.out.println("Airline Name is: " + f19.getAirlineName());
		System.out.println("Source is: " + f19.getSource());
		System.out.println("Destination is: " + f19.getDestination());
		System.out.println("Ticket Price is: " + f19.getTicketPrice());
		System.out.println("Flight Type is: " + f19.getFlightType());


		System.out.println("==========================Flight Details 20================================");
		System.out.println("ObjectReference is: " + f20);
		System.out.println("Flight Id is: " + f20.getFlightId());
		System.out.println("Flight Number is: " + f20.getFlightNumber());
		System.out.println("Airline Name is: " + f20.getAirlineName());
		System.out.println("Source is: " + f20.getSource());
		System.out.println("Destination is: " + f20.getDestination());
		System.out.println("Ticket Price is: " + f20.getTicketPrice());
		System.out.println("Flight Type is: " + f20.getFlightType());

	}

}
