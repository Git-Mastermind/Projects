package User;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.File;
public class UserOptions {
    Scanner scanner = new Scanner(System.in);
    Time time = new Time();
    public String titleScreen() {
        String titleScreen = """
                Log In:
                    1: Log In
                    2: Sign Up
                    3: Forgot Password?
                """;
        return titleScreen;
    }

    public String loggedInTitleScreen() {
        String titleScreen = """
                Welcome!
                    1: Log Out
                """;
        return titleScreen;
    }

    public ArrayList<String> logInInputs() {
        ArrayList<String> credentials = new ArrayList<String>();
        time.loadPage(2000);
        System.out.print("🖥️ Username: ");
        String username = scanner.nextLine();
        credentials.add(username);

        System.out.print("🔑 Password: ");
        String password = scanner.nextLine();
        credentials.add(password);

        return credentials;

    }




    public int authorizationCheck(String inputUsername, String inputPassword) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("info.txt"));


            String line;
            boolean authorized = false;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");

                String username = parts[0];
                String password = parts[1];

                if (inputUsername.equals(username) && inputPassword.equals(password)) {
                    authorized = true;
                    break;

                }

            }
            reader.close();
            if (authorized) return 1;
            else return 0;
        }
        catch (IOException e) {
            e.printStackTrace();
            return 2;
        }



    }
    public int logIn() {
        ArrayList<String> credentials = this.logInInputs();
        String username = credentials.get(0);
        String password = credentials.get(1);

        int authorizationCode = this.authorizationCheck(username, password);

        System.out.println("Authorizing...");
        time.sleep(2000);

        if (authorizationCode == 1) {
            System.out.println("✅ Login Successful! Welcome!");
            time.sleep(2000);
            return 1;
        }
        else {
            System.out.println("❌ Username or Password is incorrect");
            time.sleep(2000);
            return 0;
        }
    }
    public ArrayList<String> signUpInputs() {
        time.loadPage(2000);
        ArrayList<String> credentials = new ArrayList<String>();
        String username;
        boolean taken = false;
        while (true) {
            System.out.print("🖥️ Enter a username: ");
            username = scanner.nextLine();
            try {
                BufferedReader reader = new BufferedReader(new FileReader("info.txt"));
                String line;


                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");

                    String registeredUsername = parts[0].trim();
                    if (username.equalsIgnoreCase(registeredUsername)) {
                        taken = true;
                        break;
                    }

                }


            }
            catch (IOException e)  {
                System.out.println("Error");
                e.printStackTrace();
            }
            if (taken) {
                System.out.println("⚠️ Username is already taken!");
            }
            else {
                break;
            }
        }
        System.out.print("❌ Choose a password: ");
        String password = scanner.nextLine();

        credentials.add(username);
        credentials.add(password);

        return credentials;
    }

    public int signUp(String username, String password) {

        try {

            File file = new File("info.txt");



            if (!file.exists()) {
                System.out.println("⚠️ info.txt not found at " + file.getAbsolutePath());
                // Optional: create it automatically
                file.createNewFile();
                System.out.println("✅ New info.txt file created!");
            }

            FileWriter writer = new FileWriter(file, true);
            writer.write(username + "," + password + "\n");
            writer.close();
            return 1;
        } catch (IOException e) {
            System.out.println("❌ Error!");
            e.printStackTrace();
            return 0;
        }


    }
    public String returnUsername() {
        time.loadPage(2000);

        System.out.print("🖥️ Username: ");
        String username = scanner.nextLine();

        return username;
    }
    public String forgotPassword(String username) {
        String password = "Xy9Pq7Vt_L3n8HrD2mZ5bFsKjT6wNcA1";
        try {
            BufferedReader reader = new BufferedReader(new FileReader("info.txt"));
            String line;
            boolean foundPassword = false;
            outerLoop:
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (username.equals(parts[0])) {
                    password = parts[1];
                    foundPassword = true;
                    break outerLoop;
                }
            }
        }

        catch (IOException e) {
            System.out.println("❌ Error!");
            e.printStackTrace();
        }
        return password;

    }


}
