import java.io.FileReader;
import java.io.FileWriter;

public class File {

    void createFile() throws Exception {
        FileWriter fw = new FileWriter("test.txt");
        fw.write("Hello Safayet dgrthtruty");
        fw.close();
        System.out.println("Data written");
    }
    void readFile() throws Exception {
        FileReader fr = new FileReader("test.txt");
        int ch;
        while((ch = fr.read()) != -1){
            System.out.print((char) ch);
        }
        fr.close();
    }
}
