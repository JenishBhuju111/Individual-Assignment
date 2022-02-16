//c)Write a Java program to store 5 names in an array and display all the names in
//descending order.

package individual_assignment;
import  java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String>arrayList=new ArrayList<>();
        System.out.println("Enter 5 name: ");
        for(int i=0;i<=5;i++){
            String a=sc.nextLine();
            arrayList.add(a);
        }
        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println("ArrayList in descending order:");
        for(String a: arrayList){
            System.out.println(a);
        }

    }

}
