import java.util.Scanner;

public class InsertAElementInASpecificPosition {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a value capacity of Array : ");
        int a =s.nextInt();
        System.out.println("Enter a number :");
        int number []=new int[a+1];
        for (int i = 0; i < a; i++) {
            number[i]=s.nextInt();
        }
        for (int i = 0; i < a; i++) {
            System.out.print(number[i]+" ");
        }
        System.out.println("Enter a location of index to input number :");
        int location=s.nextInt();
        System.out.println("Enter a number which input in array on this location :");
        int value=s.nextInt();
        for (int i = a; i >location ; i--) {
            number[i]=number[i-1];
        }number[location]=value;
        a++;
        for (int i = 0; i < a; i++) {
            System.out.print(number[i]+" ");
        }
    }
}
