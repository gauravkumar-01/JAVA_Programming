public class Operators {
    public static void main(String[] args) {
        // // ARITHMETIC OPERATOR :

        // int a = 5;
        // int b = 9;
        // int c = a+b;
        // System.out.println(c);

        // int a1 = 10;
        // int b1 = 20;
        // int c1 = a1+b1;
        // System.out.println("Sum of a1 and b1 is : " + c1);
        // int sub = b1-a1;
        // System.out.println("Subtractions is : " + sub);

        // // ASSIGNMENT OPERATORS :

        // int a = 5; // Value 5 is assigned to variable a;
        // System.out.println(a);
        // // Augumented Assignment Operator :
        // a += 2;
        // System.out.println(a);

        // a -= 5;
        // System.out.println(a);

        // a *= 2;
        // System.out.println(a);

        // a /= 3;
        // System.out.println(a);


        // // CDOMPARISON OPERATOR :

        // int a = 5;
        // int b = 3;

        // System.out.println(a == b);
        // System.out.println(a != b);
        // System.out.println(a > b);
        // System.out.println(a >= b);
        // System.out.println(a < b);
        // System.out.println(a <= b);


        // LOGICAL OPERATOR :

        int a = 5;
        int b = 6;
        int c = 7;
        System.out.println(c > b && c > a);
        System.out.println(b > a && b > c);

        System.out.println(b > a || b > c);

        System.out.println(!(b > a));
        System.out.println(!(a > b));


    }
}
