// Strings in java


public class prog3
{
    public static void main(String args[])
    {
        String txt = "Hello this is 'context' of String";

        // length function is used to find the total no. of characters in String txt
        System.out.println(txt.length());

        // toUpperCase is used to CAPITALIZE all String value
        System.out.println(txt.toUpperCase());

        // toLowerCase is used to lower_case all String value
        System.out.println(txt.toLowerCase());

        // it is used to check index
        System.out.println(txt.indexOf("context"));

        // concat() is used to concatinate 2 strings add 2 strings together
        System.out.println(txt.concat(txt));
    }

}