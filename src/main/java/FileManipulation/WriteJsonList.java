//Write Json List

package FileManipulation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteJsonList {
    public static void main(String[] args) throws IOException, ParseException {

           String fileName="./src/main/resources/Student.json";

                   JSONParser jsonParser = new JSONParser();
                   Object obj = jsonParser.parse(new FileReader(fileName));
                   JSONArray jsonArray = (JSONArray) obj;

                   JSONObject studentObj = new JSONObject();
                   System.out.println("Input student ID: ");
                   studentObj.put("id", "2");
                   studentObj.put("name","sofik");
                   studentObj.put("department", "EEE");
                   jsonArray.add(studentObj);

                   FileWriter file = new FileWriter(fileName);
                   file.write(jsonArray.toJSONString());
                   file.flush();
                   file.close();
                   System.out.println("Saved!");
                   System.out.print(jsonArray);

        }
    }

