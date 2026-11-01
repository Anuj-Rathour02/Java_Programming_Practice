// problem10: find the larger of two numbers .

/* actually guys , maine 3 numbers ke liye
problem solve kar diya jo ki next question hai .
okay, this is my mistake */

import java.util.Scanner;
public class Problem10 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number a:");
        int a = sc.nextInt();
        System.out.println("enter the second number b:");
        int b = sc.nextInt();
        System.out.println("enter the third number c:");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("a is largest number:");
        }
        else if (b>a && b>c){
            System.out.println("b is largest number:");
        }
        else{
            System.out.println("c is largest number:");
        }
        
        sc.close();

    }
}