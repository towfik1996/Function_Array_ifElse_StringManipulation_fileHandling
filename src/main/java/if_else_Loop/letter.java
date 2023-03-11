//Write a program to check if inputted letter is small or capital


        package if_else_Loop;

import java.util.Scanner;

public class letter {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("input a char");
        char letter =scanner.next().charAt(0);

        if (letter >= 'a' && letter <= 'z' ){
            System.out.println("small letter");
        }
        else if (letter >= 'A' && letter <= 'Z') {
            System.out.println("cap letter");
        }
        else {
            System.out.println("special character");
        }
    }
}
