import java.util.Scanner;

public class SpecificValue {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i;
        int c=0;
        System.out.println("input a number to create a storage og array :");
        int a =s.nextInt();
        System.out.println("Enter a number :");
        int number []=new int[a];
        for ( i = 0; i < a; i++) {
            number[i]=s.nextInt();
        }
        for ( i = 0; i <a ; i++) {
            System.out.print(number[i]+" ");
        }
        System.out.println("\nEnter a number to know if it is in a array or not :");
        int b=s.nextInt();
        for (i = 0; i <a ; i++) {
            if (number[i] == b){
                c++;
            }
        }if(c>0){
            System.out.println("array have a this number ");
        }else{
            System.out.println("array not have this number");
        }


    }
}
