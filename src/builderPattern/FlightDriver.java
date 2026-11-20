package builderPattern;

public class FlightDriver {

    public static void main(String[] args) {

        Flight f1 = new Flight.Builder().setFlightId(101).setAirline("IndiGo").setFlightNumber("6E-201").setSource("Delhi").setDestination("Mumbai").setDepartureTime("06:00 AM").setArrivalTime("08:10 AM").setTicketPrice(5500).build();

        Flight f2 = new Flight.Builder().setFlightId(102).setAirline("Air India").setFlightNumber("AI-301").setSource("Mumbai").setDestination("Bangalore").setDepartureTime("09:00 AM").setArrivalTime("10:45 AM").setTicketPrice(6500).build();

        Flight f3 = new Flight.Builder().setFlightId(103).setAirline("Vistara").setFlightNumber("UK-501").setSource("Delhi").setDestination("Kolkata").setDepartureTime("11:00 AM").setArrivalTime("01:15 PM").setTicketPrice(7200).build();

        Flight f4 = new Flight.Builder().setFlightId(104).setAirline("SpiceJet").setFlightNumber("SG-401").setSource("Chennai").setDestination("Hyderabad").setDepartureTime("07:30 AM").setArrivalTime("08:45 AM").setTicketPrice(4800).build();

        Flight f5 = new Flight.Builder().setFlightId(105).setAirline("Akasa Air").setFlightNumber("QP-601").setSource("Pune").setDestination("Delhi").setDepartureTime("02:00 PM").setArrivalTime("04:10 PM").setTicketPrice(5900).build();

        Flight f6 = new Flight.Builder().setFlightId(106).setAirline("IndiGo").setFlightNumber("6E-202").setSource("Lucknow").setDestination("Mumbai").setDepartureTime("08:00 AM").setArrivalTime("10:15 AM").setTicketPrice(5200).build();

        Flight f7 = new Flight.Builder().setFlightId(107).setAirline("Air India").setFlightNumber("AI-302").setSource("Delhi").setDestination("Chennai").setDepartureTime("05:00 PM").setArrivalTime("07:45 PM").setTicketPrice(8100).build();

        Flight f8 = new Flight.Builder().setFlightId(108).setAirline("Vistara").setFlightNumber("UK-502").setSource("Jaipur").setDestination("Bangalore").setDepartureTime("10:30 AM").setArrivalTime("01:15 PM").setTicketPrice(7600).build();

        Flight f9 = new Flight.Builder().setFlightId(109).setAirline("SpiceJet").setFlightNumber("SG-402").setSource("Kolkata").setDestination("Delhi").setDepartureTime("06:30 AM").setArrivalTime("08:50 AM").setTicketPrice(6100).build();

        Flight f10 = new Flight.Builder().setFlightId(110).setAirline("Akasa Air").setFlightNumber("QP-602").setSource("Hyderabad").setDestination("Pune").setDepartureTime("03:00 PM").setArrivalTime("04:15 PM").setTicketPrice(4500).build();

        Flight f11 = new Flight.Builder().setFlightId(111).setAirline("IndiGo").setFlightNumber("6E-203").setSource("Bangalore").setDestination("Goa").setDepartureTime("09:15 AM").setArrivalTime("10:30 AM").setTicketPrice(3900).build();

        Flight f12 = new Flight.Builder().setFlightId(112).setAirline("Air India").setFlightNumber("AI-303").setSource("Mumbai").setDestination("Kochi").setDepartureTime("12:00 PM").setArrivalTime("02:00 PM").setTicketPrice(6800).build();

        Flight f13 = new Flight.Builder().setFlightId(113).setAirline("Vistara").setFlightNumber("UK-503").setSource("Delhi").setDestination("Ahmedabad").setDepartureTime("07:00 AM").setArrivalTime("08:30 AM").setTicketPrice(5700).build();

        Flight f14 = new Flight.Builder().setFlightId(114).setAirline("SpiceJet").setFlightNumber("SG-403").setSource("Bhopal").setDestination("Mumbai").setDepartureTime("01:00 PM").setArrivalTime("02:30 PM").setTicketPrice(4300).build();

        Flight f15 = new Flight.Builder().setFlightId(115).setAirline("Akasa Air").setFlightNumber("QP-603").setSource("Lucknow").setDestination("Hyderabad").setDepartureTime("04:00 PM").setArrivalTime("06:00 PM").setTicketPrice(6200).build();

        Flight f16 = new Flight.Builder().setFlightId(116).setAirline("IndiGo").setFlightNumber("6E-204").setSource("Chandigarh").setDestination("Delhi").setDepartureTime("06:45 AM").setArrivalTime("07:45 AM").setTicketPrice(3500).build();

        Flight f17 = new Flight.Builder().setFlightId(117).setAirline("Air India").setFlightNumber("AI-304").setSource("Chennai").setDestination("Kolkata").setDepartureTime("10:00 AM").setArrivalTime("12:30 PM").setTicketPrice(7400).build();

        Flight f18 = new Flight.Builder().setFlightId(118).setAirline("Vistara").setFlightNumber("UK-504").setSource("Pune").setDestination("Jaipur").setDepartureTime("02:30 PM").setArrivalTime("04:15 PM").setTicketPrice(5800).build();

        Flight f19 = new Flight.Builder().setFlightId(119).setAirline("SpiceJet").setFlightNumber("SG-404").setSource("Goa").setDestination("Bangalore").setDepartureTime("05:30 PM").setArrivalTime("06:45 PM").setTicketPrice(4100).build();

        Flight f20 = new Flight.Builder().setFlightId(120).setAirline("Akasa Air").setFlightNumber("QP-604").setSource("Delhi").setDestination("Varanasi").setDepartureTime("08:30 AM").setArrivalTime("09:45 AM").setTicketPrice(4900).build();

        System.out.println(f1);
        System.out.println("====================");

        System.out.println(f2);
        System.out.println("====================");

        System.out.println(f3);
        System.out.println("====================");

        System.out.println(f4);
        System.out.println("====================");

        System.out.println(f5);
        System.out.println("====================");

        System.out.println(f6);
        System.out.println("====================");

        System.out.println(f7);
        System.out.println("====================");

        System.out.println(f8);
        System.out.println("====================");

        System.out.println(f9);
        System.out.println("====================");

        System.out.println(f10);
        System.out.println("====================");

        System.out.println(f11);
        System.out.println("====================");

        System.out.println(f12);
        System.out.println("====================");

        System.out.println(f13);
        System.out.println("====================");

        System.out.println(f14);
        System.out.println("====================");

        System.out.println(f15);
        System.out.println("====================");

        System.out.println(f16);
        System.out.println("====================");

        System.out.println(f17);
        System.out.println("====================");

        System.out.println(f18);
        System.out.println("====================");

        System.out.println(f19);
        System.out.println("====================");

        System.out.println(f20);
	   }
	}

