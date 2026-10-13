package dsecjavacourse;

public class operators {
    public static void main(String args[]) {
        int a = 10;
        int b = 2;
        float c = 123.67f;
        // int g=c; it will cause an error because float is a large data type than int
        // widening type casting will nor work here//
        int g = (int) c;// narrow typecasting works here//
        double d = 455.90;
        long e = 235666771809998L;
        short f = 1;
        System.out.println(a + b + "\n" + c / d);
        if (a > b && b < c) {
            System.out.printf("%d is bigger than %d \n", a, b);
        } else {
            System.out.println("sd");
        }
        a += 100;
        b += 20;
        a++;
        ++b;

    }
}
