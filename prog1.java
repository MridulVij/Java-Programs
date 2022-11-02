import java.util.Scanner;

// Data Types in Java
// in this data type will printed and calling a method to take input from user and print the value
public class prog1
{
    public static void data_type()
    {
        Scanner input = new Scanner(System.in);

        int myint = input.nextInt();
        //char mychar = input.next();
        float myfloat = input.nextFloat();
        long mylong = input.nextLong();
        double mydouble = input.nextDouble();
        short myshort = input.nextShort();
        byte mybyte = input.nextByte();
        boolean myboolean = input.nextBoolean();
        String mystring = input.nextLine();


        System.out.println(myint);
        //System.out.println(mychar);
        System.out.println(myfloat);
        System.out.println(mydouble);
        System.out.println(mylong);
        System.out.println(myshort);
        System.out.println(mybyte);
        System.out.println(myboolean);
        System.out.println(mystring);

    }
    public static void main(String args[])
    {
        int myInt = 10;
        char myChar = 'M';
        float myFloat = 10.20f; // must place "f" in last to avoid error
        double myDouble = 123.234d; // must place "d" in last to avoid error or increasing size
        long myLong = 123345454534534534L; // must place "l" in last to increase
        short myShort = 12345;
        byte myByte = 123;
        boolean myBoolean = true;
        String myString = "Mridul";

// Printing out variables with different datatypes
        System.out.println(myInt);
        System.out.println(myChar);
        System.out.println(myFloat);
        System.out.println(myDouble);
        System.out.println(myLong);
        System.out.println(myShort);
        System.out.println(myByte);
        System.out.println(myBoolean);
        System.out.println(myString);

        // Calling Method
        data_type();
    }
}