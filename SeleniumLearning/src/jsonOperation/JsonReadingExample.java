package jsonOperation;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReadingExample {

	public static void main(String[] args) throws IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		
		FileReader reader = new FileReader("dilip.json");
		
		Object object = jsonParser.parse(reader);
		
		JSONObject jsonObject = (JSONObject) object;
		
		String nameObject = (String) jsonObject.get("Name");
		
		Long ageObject = (Long) jsonObject.get("Age");
		
		JSONArray array = (JSONArray) jsonObject.get("Special Features");
		
		Iterator iterator = array.iterator();
		
		System.out.println("This is name : " + nameObject);
		
		System.out.println("This is Age : " + ageObject);
		
		while(iterator.hasNext()) {
			
			System.out.println("This is Special Feature : "+iterator.next());
		}
		

	}

}
