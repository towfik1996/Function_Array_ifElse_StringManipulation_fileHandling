// Write a File

package FileManipulation;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("MyText.txt");
        fw.write("Hello Java");
        fw.close();
    }
}
