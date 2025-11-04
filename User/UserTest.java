package User;
import java.util.Scanner;
import java.lang.System;
public class UserTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserOptions user = new UserOptions();
        System.out.print("Username: ");
        String username = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        user.logIn(username, password);


    }

}
