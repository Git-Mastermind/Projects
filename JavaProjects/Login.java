import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Password: ");
        String inputPassword = scanner.nextLine();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            String line;
            boolean found = false;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");

                String username = parts[0];
                String password = parts[1].trim();

                if (inputUsername.equals(username) && inputPassword.equals(password)) {
                    System.out.println("Login Successfull!");
                    found = true;
                    break;
                }
                
            }
            reader.close();

            if (!found) {
                System.out.println("Login Failed!");
            }
        }
        catch (IOException e) {
            System.out.println("Error!");
            e.printStackTrace();
        }
        scanner.close();
    }
}
