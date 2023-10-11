import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SortinassendingOrder {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a value a storage capacity of array:");
        int a=s.nextInt();
        System.out.println("Enter a number :");
        int number[]=new int[a];
        for (int i = 0; i < a; i++) {
            number[i]=s.nextInt();
        }
        System.out.println("original array :");
        for (int i = 0; i < a; i++) {
            System.out.println(number[i]+" ");
        }
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
    }
}
