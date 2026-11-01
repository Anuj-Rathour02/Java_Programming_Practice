// problem20: find the product of digits.

public class Problem20 {
    
    public static void main(String[]args){
        int n = 548;
        int product = 1;
    
        while(n !=0){
            int digit = n%10;
            product *= digit;
            n = n/10;
            
        }
        System.out.println(product);
    }
    
}
    

