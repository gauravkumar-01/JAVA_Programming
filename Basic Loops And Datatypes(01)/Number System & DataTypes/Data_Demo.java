public class Data_Demo {
    public static void main(String[] args) {
        byte b = 14;
        System.out.println(b);

        int i = 428;
        System.out.println(i);

        b = (byte)i;         // TYPECASTING.....
        System.out.println(b);

        int i1 = 178;
        byte b1 = 64;
        i1 = b1;
        System.out.println(i1);

        // b1 = i1;        // It will through an error, because large number(int) cannot be stored in small number(byte).

        char ch = '5';      // Characters always be placed inside single quotes..
        System.out.println(ch);
        System.out.println((int)ch);        // Typecasting occurs from char to int.

        int val = 69;
        System.out.println((char)val);          // Typecasting occurs from int to char..

        // ch = ch+1;      // It will through an error, because integet value can not be added with character value....

        ch = 'A';
        System.out.println(ch);
        ch++;
        System.out.println(ch);

        ch = (char)(ch+1);
        System.out.println(ch);

        // long ll = 14346868556;      // It has bydefault integer value, So it can not be stored more than 10^9.
        // To store this value as long, we should use 'l' at the last of the value. So that it can be recognised as long...

        long ll = 143468685565636347l;
        System.out.println(ll);


        double d = 7.86;
        System.out.println(d);

        float f = 7.87f;            // It is bydefault stored as double, to make it floor we should write 'f' at the last of the number.
        System.out.println(f); 

        boolean bl = true;
        System.out.println(bl);
        

    }    
}
