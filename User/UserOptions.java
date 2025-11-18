package User;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class UserOptions {
    public int logIn(String inputUsername, String inputPassword) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            String line;
            
            boolean authorized = false;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");

                String username = parts[0];
                String password = parts[1];

                if (inputUsername.equals(username) && inputPassword.equals(password)) {
                    return 1;
                    
                }
                
            }
            reader.close();
            if (!authorized) {
                return 0;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
            return 2;
        }
        return -1;
        
        
    }
}
