//GENERATE RANDOM PASSWORD

package MyString;

import java.util.Random;

public class GenerateRandomPassword {
    public static void main(String[] args) {
               String password= generateRandomPassword(8);
               System.out.println(password);
            }
               public static String generateRandomPassword(int len) {
               String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghi"
                       +"jklmnopqrstuvwxyz!@#$%&";
              Random rnd = new Random();
               StringBuilder sb = new StringBuilder(len);
               for (int i = 0; i < len; i++)
                   sb.append(chars.charAt(rnd.nextInt(chars.length())));
              return sb.toString();
        }
    }
