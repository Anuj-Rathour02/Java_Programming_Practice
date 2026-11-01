// problem9: check whether a number is positive, negative or zero .

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        if(a>0){
        System.out.println("a is positive number:");
        }
        else if(a<0){
        System.out.println("a is negative number:");
        }
        else{
            System.out.println("a is  zero:");
        }
        sc.close();
        

    }
    
}
