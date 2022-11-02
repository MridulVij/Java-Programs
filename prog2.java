import java.util.Scanner;

// Type Casting
// 1. Widening Casting
// 2. Narrowing Casting

public class prog2
{
    public static void main(String args[])
    {
        // Widening Casting = Smaller to Larger data type conversion
        int var1 = 9999;
        double myDouble = var1;

        // Narrowing Casting = Larger to Smaller data type conversion
        double var2 = 9.99d;
        int myInt = (int) var2;



        System.out.println("Widening Casting - Smaller to Larger "+var1+" --> "+myDouble); // Widening Casting
        System.out.println("Narrowing Casting - Larger to Smaller "+var2+" --> "+myInt); // Narrowing Casting
    }
}
