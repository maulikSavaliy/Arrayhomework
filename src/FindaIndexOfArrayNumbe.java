import java.util.Scanner;

public class FindaIndexOfArrayNumbe {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a value a capacity of array :");
        int a =s.nextInt();
        System.out.println("Enter a number to store in array :");
        int number[]=new int[a];
        for (int i = 0; i < a; i++) {
            number[i]=s.nextInt();
        }
        System.out.println("Number you Enterd :");
        for (int i = 0; i < a; i++) {
            System.out.print(number[i]+" ");
        }
        System.out.println("\nEnter a number to find index in array :");
        int b =s.nextInt();
        for (int i = 0; i < a; i++) {
            if (number[i]==b){
                System.out.println("Index of this number in array :" + i);
            }
        }
    }
}
