// Arrays in Java
// Taking Size of Array from User and Taking Elements of Array from User

import java.util.Scanner;

public class Arrays
{
    public static void main(String[] args)
    {

        // Taking Input
        Scanner input = new Scanner(System.in);

        // Taking Input from User for Particular DataType
        int Arr_size;
        Arr_size = input.nextInt();

        // Declaring Array with DMA
        int[] Arr = new int[Arr_size];

        for(int i=0; i<Arr_size; i++)
        {
            // Taking Elements from User
            Arr[i] = input.nextInt();
        }

        for(int i=0; i<Arr_size; i++)
        {
            // Printing Elements from User
            System.out.print(Arr[i]+" ");
        }
    }
}
