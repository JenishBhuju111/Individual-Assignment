//b)Write a Java program that accepts two integer values from the user and return the
//larger values. However, if the two values are the same, return 0 and return the smaller
//value if the two values have the same remainder when divided by 7.

package individual_assignment;
import java.util.Scanner;
public class Qusetiion_2 {
    static int check(int f,int s){
        if(f==s){
            return 0;
        }
        else if(f%7==s%7){
            return Math.min(f,s);
        }
        else {
            return Math.max(f,s);
        }
    }

    public static void main(String[] args) {
        int first,second,compare,reminder;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first integer: ");
         first= sc.nextInt();
        System.out.print("Enter second integer: ");
         second= sc.nextInt();
        System.out.println("```````````````````````");
        System.out.println("First integer: "+first);
        System.out.println("Second integer: "+second);
        compare=check(first,second);
        if(compare==0){
            System.out.println("Both integer are same. ");
        }
        else{
            System.out.println("Result: "+compare);
        }
    }
}
