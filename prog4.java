// Methods in java  and basic calling of methods

import java.util.Scanner;

public class prog4
{
    // int function1() = it requires to make object in main method to access
    void function1()
    {
        System.out.println("Function 1 - Access using Object");
        //return 0;
    }

    // public int function2() = it requires to make object in main method to access
    public void function2()
    {
        System.out.println("Function 2 - Access using Object");
        //return 0;
    }

    // static in function3() = it does not require any object to access this method in main method
    static void function3()
    {
        System.out.println("Function 3 - Access without Object");
        //return 0;
    }


    public static void main(String[] args)
    {
        // Need an Object to access this methods from same class
        // Object is Created
        prog4 myObj = new prog4();

        myObj.function1();
        myObj.function2();

        // No need to make object for this
        function3();
    }
}
