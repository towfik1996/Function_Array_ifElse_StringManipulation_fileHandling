package MyString;

public class BasicString {
    public static void main(String[] args) {
        String str="Hello java";
        String str2="java";
        char[] myCharArr=str.toCharArray();

        for (char c:myCharArr) {
            System.out.println(c);
        }
        System.out.println("string length "+ str.length());
        System.out.println("string length "+ myCharArr.length);

        System.out.println(myCharArr[0]);
        System.out.println(str.charAt(3));
        System.out.println(str.indexOf("j"));

        boolean status=str.contains(str2);
        System.out.println(status);
        System.out.println(str.replace("java","world"));

        String[] words= str.split(" ");
        System.out.println(words[0]);
        System.out.println(words[1]);
    }
}
