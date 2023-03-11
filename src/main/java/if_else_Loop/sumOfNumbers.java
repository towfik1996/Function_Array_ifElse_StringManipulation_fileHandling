//Write a program to sum of numbers which only divisible by 5 from 1 to 100
package if_else_Loop;

public class sumOfNumbers {
    public static void main(String[] args) {
        int sum=0;
        for (int i=0; i<=100; i++){
            if (i % 5 == 0){
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}
