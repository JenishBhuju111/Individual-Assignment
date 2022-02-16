//a)Write a Java program to convert decimal number to binary number.

package individual_assignment;

import java.util.Scanner;

public class Question_1 {
    static void decimalToBinary(int n){
        int [] bnum =new int[1000];

        int i=0;
        while(n>0){
            bnum[i]=n%2;
            n=n/2;
            i++;
        }

        for(int j=i-1;j>=0;j--){
            System.out.print(bnum[j]);
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any integer: ");
        int n= sc.nextInt();
        System.out.println();
        System.out.println("In decimal: "+n);
        System.out.print("In Binary: ");
        decimalToBinary(n);
    }
}
