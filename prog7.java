// Default Constructor
//
//public class prog7
//{
//        public static int i;
//        public static double d;
//        static String s;
//        static float f;
//        static char c;
//        static long l;
//        static byte b;
//        static short sh;
//
//        public static void main(String[] args)
//        {
//            prog7 myObj = new prog7();
//
//            System.out.println("integer "+i);
//            System.out.println("double "+d);
//            System.out.println("float "+f);
//            System.out.println("char "+c);
//            System.out.println("long "+l);
//            System.out.println("byte "+b);
//            System.out.println("short "+sh);
//            System.out.println("String "+s);
//
//        }
//}


// Parameterized Constructor
// Constructors in Java
// 2 types of constructors in java 1. Default, 2. Parameterized

// Default Constructors in java
//public class prog7 {
//    void display() {
//        System.out.println("Default Constructor is Called!");
//    }
//
//    public static void main(String[] args) {
//        prog7 obj = new prog7();
//        obj.display();
//    }
//}
// Default Constructor in Java
public class prog7{
    void constructor(){ //default does not need any parameter to store
        System.out.println("Default Constructor");
    }
    public static void main(String[] args){
        prog7 obj = new prog7();
        obj.constructor();
    }
}


// Parameterized Constructor in Java
/*
public class prog7 {
    void display(String value) {
        System.out.println("Parameterized Constructor is Called!"+ value);
    }

    public static void main(String[] args) {
        prog7 obj = new prog7();
        obj.display("Hello");
    }
}
*/