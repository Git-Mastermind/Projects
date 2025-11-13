import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Learner {
    public void readCsv() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data.csv"));
            String line;
            String name;
            String age;
            String nationality;
            String occupation;


            while ((line = reader.readLine()) != ";") {
                String[] parts = line.split(",");

                name = parts[0];
                age = parts[1];
                nationality = parts[2];
                occupation = parts[3];

                System.out.println(name + " is a " + age + " year old " + nationality + " who is a " + occupation);


            }
        }
        catch (IOException e) {
            System.out.println("❌ Error!");
            e.printStackTrace();

        }
    }
}
