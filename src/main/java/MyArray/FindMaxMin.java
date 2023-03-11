//Find the max and min number from a given array

        package MyArray;

public class FindMaxMin {
    public static void main(String[] args) {
        int[] numbers={1,5,5,45,35,36,56,76};
        int max= numbers[0];
        int min= numbers[0];
        for (int i=0;i<numbers.length; i++){
            if (numbers[i]>max){
                max=numbers[i];
            } else if (numbers[i]<min) {
                min=numbers[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
