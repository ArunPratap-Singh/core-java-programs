package anonymousClass;

public class AnonymousClassDriver {
	
	public static void main(String[] args) {
		
		//Car
		Vehicle car = new Vehicle() {
			
			@Override
			public void start() {
				
				System.out.println("Car is Starting");
			}
			
			@Override
			public void stop() {
				
				System.out.println("Car Stopped");
			}
			
		};
		
		//Bus
		Vehicle bus = new Vehicle() {
			
			@Override
			public void start() {
				
				System.out.println("Bus is starting");
			}
			
			public void stop() {
				
				System.out.println("Bus Stopped");
			}
			
		};
		
		//Bike
		Vehicle bike = new Vehicle() {
			
			public void start() {
				
				System.out.println("Bike started");
			}
			
			public void stop() {
				
				System.out.println("Bike Stopped");
			}
			
		};
		
		//Truck
		Vehicle truck = new Vehicle() {

            public void start() {
            	
                System.out.println("Truck started");
            }

            public void stop() {
            	
                System.out.println("Truck stopped");
            }
        };
        
        //Auto
        Vehicle auto = new Vehicle() {

            public void start() {
            	
                System.out.println("Auto Rickshaw started");
            }

            public void stop() {
            	
                System.out.println("Auto Rickshaw stopped");
            }
        };
        
        //Scooter
        Vehicle scooter = new Vehicle() {

            public void start() {
            	
                System.out.println("Scooter started");
            }

            public void stop() {
            	
                System.out.println("Scooter stopped");
            }
        };
        
        //Train
        Vehicle train = new Vehicle() {

            public void start() {
            	
                System.out.println("Train started");
            }

            public void stop() {
            	
                System.out.println("Train stopped");
            }
        };
        
        //Aeroplane
        Vehicle aeroplane = new Vehicle() {

            public void start() {
            	
                System.out.println("Aeroplane started");
            }

            public void stop() {
            	
                System.out.println("Aeroplane stopped");
            }
        };
        
        //Ship
        Vehicle ship = new Vehicle() {

            public void start() {
            	
                System.out.println("Ship started");
            }

            public void stop() {
            	
                System.out.println("Ship stopped");
            }
        };
        
        //Helicopter
        Vehicle helicopter = new Vehicle() {

            public void start() {
            	
                System.out.println("Helicopter started");
            }

            public void stop() {
            	
                System.out.println("Helicopter stopped");
            }
        };
        
        //ElectricCar
        Vehicle electricCar = new Vehicle() {

            public void start() {
            	
                System.out.println("electricCar started");
            }

            public void stop() {
            	
                System.out.println("electricCar stopped");
            }
        };
        
        //Bicycle
        Vehicle bicycle = new Vehicle() {

            public void start() {
            	
                System.out.println("bicycle started");
            }

            public void stop() {
            	
                System.out.println("bicycle stopped");
            }
        };
        
        bike.start();
        bike.stop();
        System.out.println("=============");

        car.start();
        car.stop();
        System.out.println("=============");

        bus.start();
        bus.stop();
        System.out.println("=============");

        truck.start();
        truck.stop();
        System.out.println("=============");

        train.start();
        train.stop();
        System.out.println("=============");

        aeroplane.start();
        aeroplane.stop();
        System.out.println("=============");

        ship.start();
        ship.stop();
        System.out.println("=============");

        scooter.start();
        scooter.stop();
        System.out.println("=============");

        electricCar.start();
        electricCar.stop();
        System.out.println("=============");

        bicycle.start();
        bicycle.stop();
        System.out.println("=============");
        
        helicopter.start();
        helicopter.stop();
        System.out.println("=============");
        
        auto.start();
        auto.stop();
        System.out.println("=============");
        
	}

}
