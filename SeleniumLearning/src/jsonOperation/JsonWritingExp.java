package jsonOperation;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWritingExp {

	public static void main(String[] args) throws IOException {
		
		JSONObject jsonObject = new JSONObject();
		
		jsonObject.put("Name", "Dilip");
		jsonObject.put("Age", 1);
		
		JSONArray array = new JSONArray();
		array.add("Magnestic Simle");
		array.add("Silky Hair");
		
		jsonObject.put("Special Features", array);
		
		FileWriter filewriter = new FileWriter("dilip.json");
		
		filewriter.write(jsonObject.toJSONString());
		filewriter.close();

	}

}
