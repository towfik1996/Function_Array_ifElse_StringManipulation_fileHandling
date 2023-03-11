//Read from Json Array

package FileManipulation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadJsonList {
    public static void main(String[] args) throws IOException, ParseException {
        String fileName = "./src/main/resources/Student.json";
            JSONParser jsonParser = new JSONParser();
            Object obj = jsonParser.parse(new FileReader(fileName));
            JSONArray jsonArray = (JSONArray) obj;
            System.out.println(jsonArray);
            JSONObject studentObj = (JSONObject) jsonArray.get(1);
        System.out.println(studentObj.get("name"));
        System.out.println(studentObj.get("id"));
    }
}
