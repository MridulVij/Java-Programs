// Method Parameters and Arguments in java

public class prog5
{
    // Parameters = (String str1)
    // Arguments = ("Mridul,Madhav")
    void Parameters(String str1)
    {
        System.out.println(str1 + " Vij");
        System.out.println("Parameter Method is Called");
    }
    void Arguments(String str2)
    {
        System.out.println(str2 + " Vij");
        System.out.println("Argument Method is Called");
    }

    public static void main(String[] args)
    {
        prog5 myObj = new prog5();

        myObj.Parameters("Mridul");
        myObj.Arguments("Madhav");
    }
}
