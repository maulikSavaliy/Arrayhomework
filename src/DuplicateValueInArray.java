import java.util.Scanner;

public class DuplicateValueInArray {
    public static void main(String[] args) {
        //create a scanner class
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number to store capacity of array : ");
        //declare a variable
        int a =s.nextInt();
        //create a array
        int number[]=new int[a];
        //using for loop to input number in that array
        for (int i = 0; i < a; i++) {
            number[i]=s.nextInt();
        }
        System.out.println("original array : ");
        //using foor loop that input number print it
        for (int i = 0; i < a; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println("\nnew array :");
        //using for inside for loop to find duplicate value in same string
        for (int i = 0; i < a; i++) {
            for (int j = i+1; j <a ; j++) {
                if(number[i]==number[j]){
                    System.out.print(number[j]+" ");
                }
            }

        }
    }
}
