package builderPattern;

public class HospitalDriver {

    public static void main(String[] args) {

        Hospital h1 = new Hospital.Builder().setHospitalName("Apollo Hospital").setLocation("Delhi").setHospitalType("Multi-Speciality").setTotalBeds(500).setTotalDoctors(150).setRating(4.8).build();

        Hospital h2 = new Hospital.Builder().setHospitalName("Fortis Hospital").setLocation("Noida").setHospitalType("Multi-Speciality").setTotalBeds(400).setTotalDoctors(120).setRating(4.7).build();

        Hospital h3 = new Hospital.Builder().setHospitalName("Max Hospital").setLocation("Lucknow").setHospitalType("Multi-Speciality").setTotalBeds(350).setTotalDoctors(100).setRating(4.6).build();

        Hospital h4 = new Hospital.Builder().setHospitalName("Medanta Hospital").setLocation("Gurugram").setHospitalType("Super-Speciality").setTotalBeds(600).setTotalDoctors(200).setRating(4.9).build();

        Hospital h5 = new Hospital.Builder().setHospitalName("AIIMS").setLocation("Delhi").setHospitalType("Government").setTotalBeds(800).setTotalDoctors(250).setRating(4.8).build();

        Hospital h6 = new Hospital.Builder().setHospitalName("KGMU Hospital").setLocation("Lucknow").setHospitalType("Government").setTotalBeds(700).setTotalDoctors(220).setRating(4.5).build();

        Hospital h7 = new Hospital.Builder().setHospitalName("Manipal Hospital").setLocation("Bangalore").setHospitalType("Multi-Speciality").setTotalBeds(450).setTotalDoctors(130).setRating(4.7).build();

        Hospital h8 = new Hospital.Builder().setHospitalName("Narayana Hospital").setLocation("Bangalore").setHospitalType("Super-Speciality").setTotalBeds(550).setTotalDoctors(180).setRating(4.6).build();

        Hospital h9 = new Hospital.Builder().setHospitalName("Ruby Hall Clinic").setLocation("Pune").setHospitalType("Multi-Speciality").setTotalBeds(300).setTotalDoctors(90).setRating(4.5).build();

        Hospital h10 = new Hospital.Builder().setHospitalName("Kokilaben Hospital").setLocation("Mumbai").setHospitalType("Super-Speciality").setTotalBeds(500).setTotalDoctors(160).setRating(4.8).build();

        Hospital h11 = new Hospital.Builder().setHospitalName("Care Hospital").setLocation("Hyderabad").setHospitalType("Multi-Speciality").setTotalBeds(400).setTotalDoctors(110).setRating(4.4).build();

        Hospital h12 = new Hospital.Builder().setHospitalName("Yashoda Hospital").setLocation("Hyderabad").setHospitalType("Multi-Speciality").setTotalBeds(480).setTotalDoctors(140).setRating(4.6).build();

        Hospital h13 = new Hospital.Builder().setHospitalName("Sankara Nethralaya").setLocation("Chennai").setHospitalType("Eye Specialty").setTotalBeds(200).setTotalDoctors(75).setRating(4.8).build();

        Hospital h14 = new Hospital.Builder().setHospitalName("Christian Medical College").setLocation("Vellore").setHospitalType("Teaching Hospital").setTotalBeds(600).setTotalDoctors(190).setRating(4.9).build();

        Hospital h15 = new Hospital.Builder().setHospitalName("Jaslok Hospital").setLocation("Mumbai").setHospitalType("Multi-Speciality").setTotalBeds(350).setTotalDoctors(100).setRating(4.5).build();

        Hospital h16 = new Hospital.Builder().setHospitalName("Aster Hospital").setLocation("Kochi").setHospitalType("Multi-Speciality").setTotalBeds(420).setTotalDoctors(125).setRating(4.6).build();

        Hospital h17 = new Hospital.Builder().setHospitalName("BLK-Max Hospital").setLocation("Delhi").setHospitalType("Super-Speciality").setTotalBeds(650).setTotalDoctors(210).setRating(4.7).build();

        Hospital h18 = new Hospital.Builder().setHospitalName("Ramaiah Hospital").setLocation("Bangalore").setHospitalType("Teaching Hospital").setTotalBeds(320).setTotalDoctors(95).setRating(4.4).build();

        Hospital h19 = new Hospital.Builder().setHospitalName("Civil Hospital").setLocation("Ahmedabad").setHospitalType("Government").setTotalBeds(750).setTotalDoctors(230).setRating(4.3).build();

        Hospital h20 = new Hospital.Builder().setHospitalName("District Hospital").setLocation("Kanpur").setHospitalType("Government").setTotalBeds(280).setTotalDoctors(80).setRating(4.2).build();

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



