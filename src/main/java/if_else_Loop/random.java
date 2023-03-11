package if_else_Loop;

public class random {
    public static void main(String[] args) {
        int min=20;
        int max=100;
        int rand=(int)Math.floor((Math.random() * (max - min)) + min);
        System.out.println(rand);
    }
}
