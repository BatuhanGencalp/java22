package String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Str3 {

    // Ask user to enter a password.
    // If this password consists of only lower case letters print `invalid response all lower case`
    // If this password consists of only upper case letters print `invalid response all upper case`
    // If the password contains both upper and lower case then print `valid password`.

    // You will use toUpperCase(), toLowerCase(), equals() methods from the string.
    // If else statement.


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Password");
        String password = scanner.nextLine();


        String upperpassword = password.toUpperCase();
        String loverpassord = password.toLowerCase();
        boolean isAllupper = password.equals(upperpassword);
        boolean isAlllower = password.equals(loverpassord);

        if(isAllupper){
            System.out.println("invalid response all lower case");
        }else if(isAlllower){
            System.out.println("invalid response all upper case");
        }else{
            System.out.println("valid password");

        }




    }




}
