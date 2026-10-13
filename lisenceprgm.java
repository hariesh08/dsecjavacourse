package dsecjavacourse;

import java.util.Scanner;

public class lisenceprgm {
    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter youe age :");
        int age = a.nextInt();
        String result = (age >= 18 ? "ELIGIBLE" : "NOT ELIGIBLE");
        System.out.printf("YOU ARE %s", result);
        a.close();

    }
}
