//Write a program to check if the provided user credentials are valid during login


        package if_else_Loop;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String _USERNAME ="admin";
        String _PASSWORD ="1234";

        Scanner scanner = new Scanner(System.in);
        System.out.println("inter your username");
        String username =scanner.next();
        System.out.println("inter your password");
        String password = scanner.next();

        if (_USERNAME.equals(username) && _PASSWORD.equals(password)){
            System.out.println("valid User");
        }
        else {
            System.out.println("invalid user");
        }
    }

}
