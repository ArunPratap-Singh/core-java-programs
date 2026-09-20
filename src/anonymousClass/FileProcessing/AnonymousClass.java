package anonymousClass.FileProcessing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AnonymousClass {

	public static void main(String[] args) {

		FileProcessing file = new FileProcessing() {

			@Override
			public void writeFile(String fileName, String data) {

				try (FileWriter fw = new FileWriter(fileName)) {

					fw.write("Hello This is File Processing Anonymous Class");

					System.out.println("Data written successfully.");

				} catch (IOException e) {

					System.out.println("Error while writing file.");
					e.printStackTrace();
				}

			}

			@Override
			public void readFile(String fileName) {

				try (FileReader fr = new FileReader(fileName); BufferedReader br = new BufferedReader(fr)) {

					int x = br.read();
					while (x != -1) {

						System.out.println((char) x);
						x = br.read();

					}

				} catch (IOException e) {

					System.out.println("Error while reading file.");
					e.printStackTrace();
				}

			}

			@Override
			public void countLines(String fileName) {

				int count = 0;
				try (FileReader fr = new FileReader(fileName); BufferedReader br = new BufferedReader(fr)) {

					int x = br.read();
					while (x != -1) {

						System.out.println((char) x);
						count++;
						x = br.read();

					}
					System.out.println("\nTotal Lines : " + count);

				} catch (IOException e) {

					System.out.println("Error while reading file.");
					e.printStackTrace();
				}

			}
		};

		String fileName = "student.txt";

		String data = "Name: Arunendra\n" + "Course: Software Testing\n" + "Skill: Java\n" + "Skill: Selenium\n" + "Skill: TestNG";

		file.writeFile(fileName, data);

		System.out.println("=========================");

		file.readFile(fileName);

		System.out.println("=========================");

		file.countLines(fileName);
	}

}
