import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number to stored in array: ");
        int value=s.nextInt();
        System.out.println("Enter a number : ");
int number[]=new int[value];
        for (int i = 0; i < value; i++) {
            number[i]=s.nextInt();
        }
        System.out.println("before sort : ");
        for (int i = 0; i < value; i++) {
            System.out.print(number[i] + " ");
        }
        Arrays.sort(number);
        System.out.println("\nAfter a sort :" + Arrays.toString(number));
        System.out.println("Enter a value Store a string :");
        int a =s.nextInt();
        System.out.println("enter a name :");
        String name[]=new String[a];
        for (int i = 0; i < a; i++) {
            name[i]=s.next();
        }
        System.out.println(" before sort : ");
        for (int i = 0; i < a; i++) {

            System.out.print( name[i] + " ");
        }
        Arrays.sort(name);
        System.out.println("\nAfter sort :" + Arrays.toString(name));
    }
}
