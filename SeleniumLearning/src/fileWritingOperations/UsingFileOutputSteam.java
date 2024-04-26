package fileWritingOperations;

import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFileOutputSteam {

	public static void main(String[] args) throws IOException {
		String location="UsingFileOPS.txt";
		String content="Java is Simple";
		
		FileOutputStream outputStream = new FileOutputStream(location);
		
		byte[] writeThis = content.getBytes();
		
		outputStream.write(writeThis);
		outputStream.close();

	}

}
