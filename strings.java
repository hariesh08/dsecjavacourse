package dsecjavacourse;

import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = a.nextLine();
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }
        System.out.println("Reversed string: " + reversed);
        boolean isPalindrome = true;
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) != reversed.charAt(i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }

        a.close();
    }
}
