package MyArray;

public class CountEvenNumbers {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6,7,8,9,10,47,50,99,56};
            int count=0;
        for (int i=0;i< numbers.length;i++){
            if (numbers[i]%2==0){
                count++;
                System.out.println(numbers[i]);
            }
        }
        System.out.println("Total Even number is = "+count);
    }
}
