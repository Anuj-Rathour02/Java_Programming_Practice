// problem8: print the multiplication table of a given number .

/*public class Problem8 {
    public static void  main(String[] args){
        int n = 5;
        int mult = 1;
        for( int i=1; i<=10; i++){
            mult = n*i ;
        
        System.out.println(mult);
        }
    }
    
}
    */
    


import java.util.Scanner;

public class Problem8 {
    public static  void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        System.out.println("multiplication table");

        for(int i=1; i<=10; i++){
            
            System.out.println(n*i);
        }

        sc.close();

    }

}








