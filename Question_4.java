//d) Write a Java program to display the Floyd's triangle with 7 rows, which is a right-angled
//triangle that contains consecutive natural numbers. In Floyd's triangle, the number
//starts with 1 in the top left corner, and then its consecutive filling the defined rows
//through the numbers.

package individual_assignment;
import java.util.Scanner;
public class Question_4 {
    public static void main(String[] args)
    {
        int num;
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        int number = 1;
        System.out.println("Output: ");
        for (int row = 1; row <= num; row++)
        {
            for (int column = 1; column <= row; column++)
            {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
