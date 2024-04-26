package fileReadingOperaiton;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsingBufferedReader {

	public static void main(String[] args) throws IOException {

		String location ="UsingBufferedWriter.txt";

		FileReader fileReader = new FileReader(location);

		BufferedReader reader = new BufferedReader(fileReader);

		String readLine;

		while ((readLine = reader.readLine())!=null) {
			System.out.println(readLine);
		}
		reader.close();

	}

}
