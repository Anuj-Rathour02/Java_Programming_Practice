// problem 11 : find the largest of three numbers using only if else .

    import java.util.Scanner;
public class Problem11 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number a:");
        int a = sc.nextInt();
        System.out.println("enter the second number b:");
        int b = sc.nextInt();
        System.out.println("enter the third number c:");
        int c = sc.nextInt();
        if(a>=b && a>=c){
            System.out.println("a is largest number:");
        }
        else if (b>=a && b>=c){
            System.out.println("b is largest number:");
        }
        else{
            System.out.println("c is largest number:");
        }
        
        sc.close();

    }
}
    

