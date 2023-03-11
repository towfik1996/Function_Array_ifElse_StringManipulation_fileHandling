//Sort numbers in Array
        package MyArray;

import java.util.Arrays;

public class SortDataFrommArray {
    public static void main(String[] args) {
        int[] numbers={3,5,7,34,56,9,2};
        Arrays.sort(numbers);
        for (int c:numbers) {
            System.out.println(c);
        }
    }
}
