import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int total=0;
        System.out.println("input store number in array :");
        int a =s.nextInt();
        System.out.println("Enter number : ");
        int number[]=new int[a];
        for (int i = 0; i < a; i++) {
          number[i]=s.nextInt();
        }
        System.out.println("number you enter :" );
        for (int i = 0; i < a; i++) {
            System.out.print(number[i]+" ");
            total=total+number[i];
        }
        System.out.println("\nTotal of number : " + total);
    }
}
