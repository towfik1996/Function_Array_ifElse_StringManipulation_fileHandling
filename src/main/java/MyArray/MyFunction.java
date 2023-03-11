package MyArray;

public class MyFunction {
    public static void main(String[] args) {
        MyFunction myFunction=new MyFunction();
       // myFunction.sayHello("towfik");
        double res= myFunction.doSum(5,7);
        myFunction.doMultiply(res);

    }
    public void sayHello( String name){
        System.out.println("hello "+name);
    }
    private double doSum(double num1, double num2){
        return num1+num2;
    }
    private void doMultiply(double a){
        System.out.println(a*2);
    }
}
