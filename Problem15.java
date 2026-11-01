// problem15:  check whether a number lies between 10 and 50 .

import java.util.Scanner;
public class Problem15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number a:");
        int a = sc.nextInt();
        if(a>=10 && a<=50){
            System.out.println("a lies between 10 and 50");
        }
        else{
            System.out.println("a does not lie between 10 annd 50");
        }
        sc.close();

    }
    
}
