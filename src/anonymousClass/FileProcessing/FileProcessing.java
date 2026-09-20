package anonymousClass.FileProcessing;

public interface FileProcessing {
	
	void writeFile(String fileName, String data);

    void readFile(String fileName);

    void countLines(String fileName);

}
