package builderPattern;

public class ComputerDriver {

    public static void main(String[] args) {

        Computer c1 = new Computer.Builder().setComputerId(101).setBrand("Dell").setProcessor("Intel Core i5").setRam(8).setStorage(512).setOperatingSystem("Windows 11").setPrice(55000).setColor("Black").build();

        Computer c2 = new Computer.Builder().setComputerId(102).setBrand("HP").setProcessor("Intel Core i7").setRam(16).setStorage(1024).setOperatingSystem("Windows 11").setPrice(75000).setColor("Silver").build();

        Computer c3 = new Computer.Builder().setComputerId(103).setBrand("Lenovo").setProcessor("AMD Ryzen 5").setRam(8).setStorage(512).setOperatingSystem("Windows 11").setPrice(48000).setColor("Grey").build();

        Computer c4 = new Computer.Builder().setComputerId(104).setBrand("Apple").setProcessor("Apple M3").setRam(16).setStorage(512).setOperatingSystem("macOS").setPrice(125000).setColor("Space Grey").build();

        Computer c5 = new Computer.Builder().setComputerId(105).setBrand("Asus").setProcessor("Intel Core i9").setRam(32).setStorage(2048).setOperatingSystem("Windows 11").setPrice(145000).setColor("Black").build();

        Computer c6 = new Computer.Builder().setComputerId(106).setBrand("Acer").setProcessor("Intel Core i5").setRam(8).setStorage(512).setOperatingSystem("Windows 11").setPrice(45000).setColor("Blue").build();

        Computer c7 = new Computer.Builder().setComputerId(107).setBrand("MSI").setProcessor("Intel Core i7").setRam(16).setStorage(1024).setOperatingSystem("Windows 11").setPrice(95000).setColor("Black").build();

        Computer c8 = new Computer.Builder().setComputerId(108).setBrand("Samsung").setProcessor("Intel Core i5").setRam(16).setStorage(512).setOperatingSystem("Windows 11").setPrice(65000).setColor("Silver").build();

        Computer c9 = new Computer.Builder().setComputerId(109).setBrand("Dell").setProcessor("AMD Ryzen 7").setRam(16).setStorage(1024).setOperatingSystem("Windows 11").setPrice(85000).setColor("Grey").build();

        Computer c10 = new Computer.Builder().setComputerId(110).setBrand("HP").setProcessor("Intel Core i3").setRam(8).setStorage(256).setOperatingSystem("Windows 11").setPrice(38000).setColor("White").build();

        Computer c11 = new Computer.Builder().setComputerId(111).setBrand("Lenovo").setProcessor("Intel Core i7").setRam(16).setStorage(512).setOperatingSystem("Windows 11").setPrice(72000).setColor("Black").build();

        Computer c12 = new Computer.Builder().setComputerId(112).setBrand("Apple").setProcessor("Apple M2").setRam(8).setStorage(256).setOperatingSystem("macOS").setPrice(95000).setColor("Silver").build();

        Computer c13 = new Computer.Builder().setComputerId(113).setBrand("Asus").setProcessor("AMD Ryzen 7").setRam(16).setStorage(1024).setOperatingSystem("Windows 11").setPrice(88000).setColor("Blue").build();

        Computer c14 = new Computer.Builder().setComputerId(114).setBrand("Acer").setProcessor("Intel Core i7").setRam(16).setStorage(512).setOperatingSystem("Windows 11").setPrice(78000).setColor("Black").build();

        Computer c15 = new Computer.Builder().setComputerId(115).setBrand("MSI").setProcessor("Intel Core i9").setRam(32).setStorage(2048).setOperatingSystem("Windows 11").setPrice(160000).setColor("Grey").build();

        Computer c16 = new Computer.Builder().setComputerId(116).setBrand("Samsung").setProcessor("Intel Core i7").setRam(16).setStorage(1024).setOperatingSystem("Windows 11").setPrice(92000).setColor("Silver").build();

        Computer c17 = new Computer.Builder().setComputerId(117).setBrand("Dell").setProcessor("Intel Core i3").setRam(8).setStorage(256).setOperatingSystem("Ubuntu").setPrice(35000).setColor("Black").build();

        Computer c18 = new Computer.Builder().setComputerId(118).setBrand("HP").setProcessor("AMD Ryzen 7").setRam(16).setStorage(1024).setOperatingSystem("Windows 11").setPrice(82000).setColor("Blue").build();

        Computer c19 = new Computer.Builder().setComputerId(119).setBrand("Lenovo").setProcessor("Intel Core i5").setRam(16).setStorage(512).setOperatingSystem("Ubuntu").setPrice(58000).setColor("Grey").build();

        Computer c20 = new Computer.Builder().setComputerId(120).setBrand("Asus").setProcessor("AMD Ryzen 9").setRam(32).setStorage(2048).setOperatingSystem("Windows 11").setPrice(135000).setColor("Black").build();

        System.out.println(c1);
        System.out.println("====================");

        System.out.println(c2);
        System.out.println("====================");

        System.out.println(c3);
        System.out.println("====================");

        System.out.println(c4);
        System.out.println("====================");

        System.out.println(c5);
        System.out.println("====================");

        System.out.println(c6);
        System.out.println("====================");

        System.out.println(c7);
        System.out.println("====================");

        System.out.println(c8);
        System.out.println("====================");

        System.out.println(c9);
        System.out.println("====================");

        System.out.println(c10);
        System.out.println("====================");

        System.out.println(c11);
        System.out.println("====================");

        System.out.println(c12);
        System.out.println("====================");

        System.out.println(c13);
        System.out.println("====================");

        System.out.println(c14);
        System.out.println("====================");

        System.out.println(c15);
        System.out.println("====================");

        System.out.println(c16);
        System.out.println("====================");

        System.out.println(c17);
        System.out.println("====================");

        System.out.println(c18);
        System.out.println("====================");

        System.out.println(c19);
        System.out.println("====================");

        System.out.println(c20);
	   }
	}


