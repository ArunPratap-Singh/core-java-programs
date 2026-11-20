package builderPattern;

public class HotelDriver {

    public static void main(String[] args) {

        Hotel h1 = new Hotel.Builder().setHotelId(101).setHotelName("Taj Palace").setLocation("Delhi").setRoomType("Deluxe").setNumberOfRooms(2).setPricePerNight(12000).setNumberOfNights(3).setRating("5 Star").build();

        Hotel h2 = new Hotel.Builder().setHotelId(102).setHotelName("The Oberoi").setLocation("Mumbai").setRoomType("Luxury").setNumberOfRooms(1).setPricePerNight(15000).setNumberOfNights(2).setRating("5 Star").build();

        Hotel h3 = new Hotel.Builder().setHotelId(103).setHotelName("ITC Grand").setLocation("Bangalore").setRoomType("Executive").setNumberOfRooms(2).setPricePerNight(9000).setNumberOfNights(4).setRating("5 Star").build();

        Hotel h4 = new Hotel.Builder().setHotelId(104).setHotelName("Lemon Tree").setLocation("Jaipur").setRoomType("Standard").setNumberOfRooms(1).setPricePerNight(4500).setNumberOfNights(2).setRating("4 Star").build();

        Hotel h5 = new Hotel.Builder().setHotelId(105).setHotelName("Radisson Blu").setLocation("Lucknow").setRoomType("Deluxe").setNumberOfRooms(2).setPricePerNight(7000).setNumberOfNights(3).setRating("5 Star").build();

        Hotel h6 = new Hotel.Builder().setHotelId(106).setHotelName("Hyatt Regency").setLocation("Pune").setRoomType("Premium").setNumberOfRooms(1).setPricePerNight(8500).setNumberOfNights(5).setRating("5 Star").build();

        Hotel h7 = new Hotel.Builder().setHotelId(107).setHotelName("Novotel").setLocation("Chennai").setRoomType("Standard").setNumberOfRooms(2).setPricePerNight(6000).setNumberOfNights(2).setRating("4 Star").build();

        Hotel h8 = new Hotel.Builder().setHotelId(108).setHotelName("Holiday Inn").setLocation("Hyderabad").setRoomType("Suite").setNumberOfRooms(1).setPricePerNight(9500).setNumberOfNights(3).setRating("4 Star").build();

        Hotel h9 = new Hotel.Builder().setHotelId(109).setHotelName("The Leela").setLocation("Mumbai").setRoomType("Luxury").setNumberOfRooms(2).setPricePerNight(18000).setNumberOfNights(2).setRating("5 Star").build();

        Hotel h10 = new Hotel.Builder().setHotelId(110).setHotelName("Marriott").setLocation("Kolkata").setRoomType("Executive").setNumberOfRooms(1).setPricePerNight(11000).setNumberOfNights(4).setRating("5 Star").build();

        Hotel h11 = new Hotel.Builder().setHotelId(111).setHotelName("Ginger Hotel").setLocation("Noida").setRoomType("Standard").setNumberOfRooms(1).setPricePerNight(3500).setNumberOfNights(2).setRating("3 Star").build();

        Hotel h12 = new Hotel.Builder().setHotelId(112).setHotelName("Clarks Inn").setLocation("Agra").setRoomType("Deluxe").setNumberOfRooms(2).setPricePerNight(5000).setNumberOfNights(3).setRating("4 Star").build();

        Hotel h13 = new Hotel.Builder().setHotelId(113).setHotelName("Fortune Hotel").setLocation("Indore").setRoomType("Premium").setNumberOfRooms(1).setPricePerNight(6500).setNumberOfNights(2).setRating("4 Star").build();

        Hotel h14 = new Hotel.Builder().setHotelId(114).setHotelName("Vivanta").setLocation("Goa").setRoomType("Sea View").setNumberOfRooms(2).setPricePerNight(13000).setNumberOfNights(4).setRating("5 Star").build();

        Hotel h15 = new Hotel.Builder().setHotelId(115).setHotelName("The Lalit").setLocation("New Delhi").setRoomType("Luxury").setNumberOfRooms(1).setPricePerNight(14000).setNumberOfNights(3).setRating("5 Star").build();

        Hotel h16 = new Hotel.Builder().setHotelId(116).setHotelName("Sarovar Portico").setLocation("Varanasi").setRoomType("Standard").setNumberOfRooms(2).setPricePerNight(4000).setNumberOfNights(2).setRating("3 Star").build();

        Hotel h17 = new Hotel.Builder().setHotelId(117).setHotelName("Ramada").setLocation("Dehradun").setRoomType("Deluxe").setNumberOfRooms(1).setPricePerNight(5500).setNumberOfNights(3).setRating("4 Star").build();

        Hotel h18 = new Hotel.Builder().setHotelId(118).setHotelName("Fairfield").setLocation("Ahmedabad").setRoomType("Executive").setNumberOfRooms(2).setPricePerNight(7500).setNumberOfNights(2).setRating("4 Star").build();

        Hotel h19 = new Hotel.Builder().setHotelId(119).setHotelName("The Park").setLocation("Bangalore").setRoomType("Suite").setNumberOfRooms(1).setPricePerNight(10000).setNumberOfNights(5).setRating("5 Star").build();

        Hotel h20 = new Hotel.Builder().setHotelId(120).setHotelName("Country Inn").setLocation("Gurgaon").setRoomType("Premium").setNumberOfRooms(2).setPricePerNight(8000).setNumberOfNights(3).setRating("4 Star").build();

        System.out.println(h1);
        System.out.println("====================");

        System.out.println(h2);
        System.out.println("====================");

        System.out.println(h3);
        System.out.println("====================");

        System.out.println(h4);
        System.out.println("====================");

        System.out.println(h5);
        System.out.println("====================");

        System.out.println(h6);
        System.out.println("====================");

        System.out.println(h7);
        System.out.println("====================");

        System.out.println(h8);
        System.out.println("====================");

        System.out.println(h9);
        System.out.println("====================");

        System.out.println(h10);
        System.out.println("====================");

        System.out.println(h11);
        System.out.println("====================");

        System.out.println(h12);
        System.out.println("====================");

        System.out.println(h13);
        System.out.println("====================");

        System.out.println(h14);
        System.out.println("====================");

        System.out.println(h15);
        System.out.println("====================");

        System.out.println(h16);
        System.out.println("====================");

        System.out.println(h17);
        System.out.println("====================");

        System.out.println(h18);
        System.out.println("====================");

        System.out.println(h19);
        System.out.println("====================");

        System.out.println(h20);
	   }
	}


