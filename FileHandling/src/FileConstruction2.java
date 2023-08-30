import java.io.File;
import java.io.IOException;

public class FileConstruction2 {
    public static void main(String[] args) throws IOException {

        File obj = new File("Avishkar","Code1.txt");

        obj.createNewFile();

        File obj1 = new File("Core2Web","Core");

        obj1.mkdir();
    }
}
