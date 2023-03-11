// Write Json

package FileManipulation;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteJSON {
    public static void main(String[] args) throws IOException {
        JSONObject jsonObject=new JSONObject();

        jsonObject.put("name","towfik");
        jsonObject.put("phone","015555555555");


        JSONObject addressObj=new JSONObject();
        addressObj.put("thana","Gulshan");
        addressObj.put("po","1212");

        jsonObject.put("address",addressObj);

        System.out.println(jsonObject);

        FileWriter file = new FileWriter("./src/main/resources/Employee.json");
           file.write(jsonObject.toJSONString());
           file.flush();
           file.close();
    }
}
