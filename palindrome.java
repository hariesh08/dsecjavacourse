package dsecjavacourse;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = a.nextLine();
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }
        boolean isPalindrome = true;
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) != reversed.charAt(i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        a.close();
    }
}
