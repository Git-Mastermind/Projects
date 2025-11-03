import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public  class Playground {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        }
        catch (IOException e) {
          System.out.println("Error!");
          e.printStackTrace();
        }
    }
    


    
    
    

    

    
    
}
