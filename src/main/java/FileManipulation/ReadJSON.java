// Read Json

package FileManipulation;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadJSON {
    public static void main(String[] args) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
           Object obj = jsonParser.parse(new FileReader("./src/main/resources/Employee.json"));
           JSONObject empObj = (JSONObject) obj;

           System.out.println(empObj);
          String name = (String) empObj.get("name");
          System.out.println(name);

          JSONObject addressObj = (JSONObject) empObj.get("address");
          String address=(String) addressObj.get("thana");
        System.out.println(address);
        String po=(String) addressObj.get("po");
        System.out.println(po);
          String phone = (String) empObj.get("phone");
         System.out.println(phone);
    }
}
