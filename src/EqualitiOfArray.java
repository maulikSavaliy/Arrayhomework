import java.util.Arrays;
import java.util.Scanner;

public class EqualitiOfArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a value storage capacity of array : ");
        int a =s.nextInt();
        System.out.println("Enter a first array number :");
        int number[]=new int[a];
        for (int i = 0; i < a; i++) {
            number[i]=s.nextInt();
        }
        for (int i = 0; i < a; i++) {
            System.out.print(number[i]+" ");
        }
        System.out.println("\nEnter a value of second array  :");
        int b =s.nextInt();
        System.out.println("Enter number :");
        int number1[]=new int[b];
        for (int i = 0; i < b; i++) {
            number1[i]=s.nextInt();
        }
        for (int i = 0; i < b; i++) {
            System.out.print(number1[i]+" ");
        }
        System.out.println("\n"+Arrays.equals(number,number1));
    }
}
