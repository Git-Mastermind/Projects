import java.io.FileWriter;
import java.io.IOException;

public  class Playground {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("data.txt", true);
            writer.write("username: Eshan/n");
            writer.write("password: hello123");
            writer.close();
            System.out.println("Data Saved Successfully");
        }
        catch (IOException e) {
            System.out.println("Error!");
            e.printStackTrace();
        }
    }
    


    
    
    

    

    
    
}
