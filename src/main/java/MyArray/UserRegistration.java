package MyArray;

public class UserRegistration {
    public static void main(String[] args) {
        UserRegistration registration=new UserRegistration();
        String AllData= registration.doRegistration("towfik", "towfik@gmail.com", "123456", "0177777777","dhaka");
        System.out.println(AllData);

    }
    public String doRegistration(String name, String email, String password, String phone, String Address){
        return name+" "+email+" "+password+" "+phone+" "+Address;
    }
}
