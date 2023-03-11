//Find if a given element is exists in the array

        package MyArray;

public class CheckIfElementExists {
    public static void main(String[] args) {
        int[] numbers={2,4,6,1,8,9,5};
        int number=8;
        boolean found=false;
        int i;
        for (i=0;i<numbers.length;i++){
            if(numbers[i]==number){
                found=true;
                break;
            }
        }
        if (!found){
            System.out.println("Not Found");
        }
        else {
            System.out.println("Found in "+i+" position");
        }
    }
}
