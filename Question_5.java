//e) Write a Java program to search a value in an array using binary search. For sorting an
//array use Quick sort algorithm.

package individual_assignment;

import java.util.Scanner;
class Quicksort {
    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return (i + 1);
    }

    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
}

public class Question_5 {
    static void searchBinary(int []arr,int search,int first,int last){
        int mid = (first + last)/2;
        while( first <= last ){
            if ( arr[mid] < search ){
                first = mid + 1;
            }else if ( arr[mid] == search ){
                System.out.print("Element is found at index: " + mid);
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println("Element is not found!");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the value of ["+i+"] : ");
            arr[i]= sc.nextInt();
        }
        Quicksort.quickSort(arr, 0, size - 1);
        System.out.println("After sorting: ");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
        System.out.print("Enter the value to search: ");
        int search=sc.nextInt();
        int first=0;
        int last=size-1;
        searchBinary(arr,search,first,last);
    }
}
