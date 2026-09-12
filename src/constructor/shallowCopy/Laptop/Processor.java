package constructor.shallowCopy.Laptop;

public class Processor {
	
		int processorNumber;
		String processorType;
		int cores;
		String generation;
		double speed;
		String manufacturer;

		Processor() {

		}

		Processor(int processorNumber, String processorType, int cores, String generation, double speed, String manufacturer) {

			this.processorNumber = processorNumber;
			this.processorType = processorType;
			this.cores = cores;
			this.generation = generation;
			this.speed = speed;
			this.manufacturer = manufacturer;

		}

		public String toString() {

			return "ProcessorNumber is: " + processorNumber + "\nProcessorType is: " + processorType + "\nCores is: " + cores + "\nGeneration is: " + generation + "\nSpeed is: " + speed + "\nManufacturer is: " + manufacturer;

		}

	

}
