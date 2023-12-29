/*
 2. Palindrome Checker 
 Write a program that checks if a given word is a palindrome.
 */
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string to check Palindrome:");
        String str = scan.nextLine();
        String revStr ="";
        scan.close();
        for(int i = str.length() - 1; i>=0; i--){
            revStr = revStr+str.charAt(i);
        }

        if(str.equals(revStr)){
            System.out.println("Given String is Palindrome");
        } else {
            System.out.println("Given String is not Palindrome");
        }
   

    }
}
