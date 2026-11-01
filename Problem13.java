// problem13: check whether a number is divisible by 3 and 5. 

import java.util.Scanner;
public class Problem13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number a:");
        int a = sc.nextInt();
            if(a%3==0 && a%5==0){
                System.out.println("a is divisible by 3 and 5:");
        }
        else{
            System.out.println("a is not divisible by 3 and  5:");;
        }
        sc.close();
    }
    
}



    

