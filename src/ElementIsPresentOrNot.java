import java.util.Scanner;

public class ElementIsPresentOrNot {
    public static void main(String[] args) {
        //create a scanner class
        Scanner s =new Scanner(System.in);
        //declare a variable
        int c=0;
        System.out.println("Enter a number  capacity of Array :");
        int a =s.nextInt();
        System.out.println("Enter number :");
        //create a array
        int number []=new int[a];
        //using for loop for input number in that array
        for (int i = 0; i < a; i++) {
            number[i]=s.nextInt();
        }
        System.out.println("Array :");
        //using a forloop to print array
        for (int i = 0; i < a; i++) {
            System.out.println(number[i]+" ");
        }
        System.out.println("Enter a number to know it is present in array or not");
        int b=s.nextInt();
        //using a forloop to find a number or not
        for (int i = 0; i < a; i++) {
            if (b == number[i]) {
                c++;
            }
            //using if statement
        }if(c!=0){
                System.out.println(b+"is present in this array ");
            }else{
                System.out.println(b+"is not present in this array ");
            }

    }
}
