// problem25: count how many  times a particular digit occurs.

import java.util.Scanner;

public class Problem25 {
    public static void main(String[]args){

        int n = 1238899333 ;
        int count = 0;
        
        System.out.println("enter a number:");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        while(n!=0){
            int digit = n%10 ;
            if(digit == target){
                count++ ;  
            }

            n = n/10 ;
        }

        System.out.println("the number of digit is:");
        System.out.println(count);
        sc.close();

}

}
