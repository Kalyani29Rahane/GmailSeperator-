package com.tka;
import java.util.Scanner;

public class Gmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

       
        if (email.endsWith("@gmail.com")) {
            System.out.println("Email address is VALID ");

           
            String digits = "";
            for (int i = 0; i < email.length(); i++) {
                char ch = email.charAt(i);
                if (Character.isDigit(ch)) {
                    digits += ch;
                }
            }

          
            System.out.println("Digits in the email: " + digits);
            System.out.println("Total digit count: " + digits.length());

        } else {
            System.out.println("Email address is NOT valid ");
        }

        scanner.close();
    }
}
