import java.util.Scanner;

public class CommanValueOfString {
    public static void main(String[] args) {
        // create a scanner class
        Scanner s=new Scanner(System.in);
        //print a massage
        System.out.println("Input a number a storage capacity of array :");
        //declare a variable
        int a =s.nextInt();
        System.out.println("Enter a name to store in array :");
        //create a array
        String name []=new String[a];
        //create a for loop to input value in array
        for (int i = 0; i < a; i++) {
            name[i]=s.next();
        }
        System.out.println("enter a number :");
        //create a forloop print a array
        for (int i = 0; i < a; i++) {
            System.out.print(name[i]+ " ");
        }
        System.out.println("\nEnter second array storage capacity :");
        int b=s.nextInt();
        System.out.println("Enter a number :");
        //create a array 2
        String name1[]=new String[b];
        //create a forloop input number in array
        for (int i = 0; i < b; i++) {
            name1[i]=s.next();
        }
        //print a massage
        System.out.println("String 2 :");
        // print a number input in a array
        for (int i = 0; i < b; i++) {
            System.out.print(name1[i]+" ");
        }
        System.out.println("\nRepeat String : ");
        // applu for inside for loop for find comman value so that two string
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if(name[i].equals(name1[j])){
                    System.out.print(name1[j]+" ");
                }
            }

        }
    }
}
