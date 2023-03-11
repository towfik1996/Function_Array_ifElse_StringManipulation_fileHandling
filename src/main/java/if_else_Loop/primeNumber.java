//Write a program to print prime numbers from 2 to n


        package if_else_Loop;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input your number");
        int a=input.nextInt();
        int count = 0;
        if (a <= 1) {
            System.out.println("The number is not prime");
            return;
        }
        for (int i=1; i<=a/2; i++){
            if (a%i==0){
                count++;
            }
        }
        if (count > 1) {
            System.out.println("The number is not prime");
        }
        else {
            System.out.println("The number is prime");
        }
    }
}
