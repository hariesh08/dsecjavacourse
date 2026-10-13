package dsecjavacourse;

import java.util.Scanner;

public class inputoutput {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter your name :");
        String name=a.nextLine();
        System.out.println("Enter your age :");
        int age = a.nextInt();
        System.out.println("Enter your mobile :");
        long mobile = a.nextLong();
        System.out.println("Enter you marks:");
        double marks=a.nextDouble();
        System.out.println("THANK YOU FOR VISITING US !");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(name+"\n"+age+"\n"+mobile+"\n"+marks);
        System.out.print("hello");
        System.out.printf(",How are u %s",name);

    }
}
