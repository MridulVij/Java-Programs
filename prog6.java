// Method Overloading in Java

// Overloading Contains multiple methods with different data type can have the same name of method.
// Method Overloading in Java

public class prog6
{
    int method(int variable)
    {
        System.out.println(variable);
        System.out.println("Method Overloading in java");
        return 0;
    }

    float method(float variable)
    {
        System.out.println(variable);
        System.out.println("Method Overloading in java");
        return 0;
    }

    char method(char variable)
    {
        System.out.println(variable);
        System.out.println("Method Overloading in java");
        return 0;
    }

    //etc.

    public static void main(String[] args)
    {
        prog6 myObj = new prog6();
        myObj.method(10);
    }
}
