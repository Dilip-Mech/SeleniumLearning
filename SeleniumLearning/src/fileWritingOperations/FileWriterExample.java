package fileWritingOperations;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		
		String location="UsingFileWriter.txt";
		String content="Hi Am Dilip";
		
		FileWriter fileWriter = new FileWriter(location);
		
		fileWriter.write(content);
		
		fileWriter.close();
	}

}
