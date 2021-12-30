import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Shahd Khartabil
 * 30 Days of Coding: Day 1
 * Simple password validator: validates a password.
 * Password must have:
 * at least 8 characters
 * at least one upercase letter
 */

public class PassValidator {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int capital = 0;

        //user input of password
        System.out.println("Please enter a password: ");

        String password = kb.nextLine();

        //requirements: Must be at least 8 characters long
        //must include one Uppercase letter
        //must include one special character
        if(password.length()<8){
            System.out.println("Your password needs to be at least 8 characters long");
        }
        //if it contains a capital letter add one
        for (int i = 0; i <password.length() ; i++) {
            if(password.charAt(i)>64 && password.charAt(i)<91){
                capital++;
            }
        }
        if(capital==0){
            System.out.println("Your password needs to have at least 1 uppercase letter");
        }


//        //this is to find any special characters but it is not working
//        Pattern p = Pattern.compile("[^A-Z0-9 ]");
//        Matcher m = p.matcher(password);
//        if(!m.find()){
//            System.out.println("Your password needs to have a special character in it. ");
//        }












    }
}
