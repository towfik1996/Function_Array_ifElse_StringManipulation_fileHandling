package MyArray;

public class FindMaxMinUsingArray {
    public static void main(String[] args) {
        int[] numbers={3,5,7,34,56,9,2};

        System.out.println("Max Number is "+findMax(numbers));
        System.out.println("Min Number is "+findMin(numbers));
    }
    public static int findMax(int[] numbers){
        int max=numbers[0];
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]>max){
                max=numbers[i];
            }
        }
        return max;

    }public static int findMin(int[] numbers){
        int min=numbers[0];
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]<min){
                min=numbers[i];
            }
        }
        return min;

    }
}
