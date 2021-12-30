import java.util.Random;
/* Shahd Khartabil
 * 30 Days of Coding: Day 2
 * Simple password generator: generate a password of length 8-20 random characters and at least one upercase letter
 */
public class PassGenerator {
    public static void main(String[] args) {
        final int LENGTH;

        String password;

        //choose a random number between 8-20
        int size = (int)Math.floor(Math.random()*(20-8+1)+8);

        //get a random character that many times
        for (int i = 0; i < size; i++) {
            //65-90 are uppercase letters
            //97-122 are lowercase letters

        }

        //add it  to the string
    }
}
