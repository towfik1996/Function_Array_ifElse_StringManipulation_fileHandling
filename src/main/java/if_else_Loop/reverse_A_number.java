//REVERSE A NUMBER

package if_else_Loop;

public class reverse_A_number {
    public static void main(String[] args) {
        int number=543, reverse=0;
           while(number!=0){
               int rem=number%10;
               number=number/10;
            reverse=reverse*10+rem;
           }
             System.out.println(reverse);
    }
}
