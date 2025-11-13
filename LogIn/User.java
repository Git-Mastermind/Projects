package LogIn;
import java.util.Scanner;
import java.lang.System;
import java.util.ArrayList;



public class User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserOptions user = new UserOptions();
        Time time = new Time();

        boolean loggedIn = false;

        while (true) {
            while (loggedIn) {
                System.out.println(user.loggedInTitleScreen());
                System.out.print("Choose an option: ");
                int input = scanner.nextInt();
                scanner.nextLine();

                if (input == 1) {
                    time.loadPage(2000);
                    loggedIn = false;
                    System.out.println("Logging out...");
                    time.sleep(2000);

                    System.out.println("✅ Successfully logged out!");
                    time.sleep(1250);
                    break;
                }
                else {
                    System.out.println(user.invalidInput());
                    time.sleep(2000);
                }
            }
            System.out.println(user.titleScreen());
            System.out.print("Choose an option: ");
            int optionInput = scanner.nextInt();
            scanner.nextLine();

            if (optionInput == 1) {
                int authorizationCode = user.logIn();
                if (authorizationCode == 1) {
                    loggedIn = true;
                }
                else {
                    System.out.println("❌ Username or password is incorrect");
                }
            }

            else if (optionInput == 2) {
                ArrayList<String> credentials = user.signUpInputs();
                String username = credentials.getFirst();
                String password = credentials.get(1);

                int authorizationCode = user.signUp(username, password);
                System.out.println("Authorizing...");
                time.sleep(2000);
                if (authorizationCode == 1) {
                    System.out.println("Successfully signed up!");
                    time.sleep(2000);
                }
                else {
                    System.out.println("ERROR ENCOUNTERED!");
                    time.sleep(1000);
                }
            }
            if (optionInput == 3) {
                String username = user.returnUsername();
                String password = user.forgotPassword(username);
                System.out.println("Authorizing...");
                time.sleep(2000);
                System.out.println("Opening file...");
                time.sleep(500);
                System.out.println("Double checking...");
                time.sleep(750);
                System.out.println("Encrypting...");
                time.sleep(750);
                System.out.println("Retreiving...");
                time.sleep(300);

                if (password.equals("Xy9Pq7Vt_L3n8HrD2mZ5bFsKjT6wNcA1")) {
                    System.out.println("❌ Username not found");
                    time.sleep(1500);
                }
                else {
                    System.out.println("🔑 Your password is: " + password + "!");
                    time.sleep(2000);
                }
            }
            if (optionInput == 101) {
                System.out.println("Current working directory: " + System.getProperty("user.dir"));
            }



            }

            }










    }



