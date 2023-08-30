import java.io.File;
import java.io.IOException;

public class FileConstruction3 {
    public static void main(String[] args) throws IOException {

        File obj1 = new File("Core2Web");

        File obj2 = new File("obj1","Code2.txt");

        obj1.createNewFile();
    }
}
