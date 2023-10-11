import java.util.Scanner;

public class ReversArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a value storage capacity of array :");
        int a =s.nextInt();
        System.out.println("Enter a number :");
        int number []=new int[a];
        for (int i = 0; i < a; i++) {
            number[i]=s.nextInt();
        }
        for (int i = 0; i < a; i++) {
            System.out.print(number[i]+" ");
        }
        System.out.println("\nReverse number of array :");
        for (int i = a-1; i >=0 ; i--) {
            System.out.print(number[i]+" ");
        }
    }
}
