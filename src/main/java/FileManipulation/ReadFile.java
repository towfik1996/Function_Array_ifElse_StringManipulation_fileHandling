// Read a File

package FileManipulation;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        FileReader reader=new FileReader("D:\\SQA-online\\Java\\First-java\\testJava\\MyText.txt");
        int character;
        while ((character=reader.read())!= -1){
            System.out.print((char) character);
        }
        reader.close();
    }
}
