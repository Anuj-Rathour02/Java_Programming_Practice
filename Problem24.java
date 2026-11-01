// problem24: count the number of odd digits.

public class Problem24 {
    
    public static void main(String[]args){
        int  n = 123456789;
        int count = 0;
        while(n !=0){
           int digit = n%10;
            if(digit%2!=0){
            
                count++;

            }
            n = n/10;
        }
        System.out.println("odd digits are:");
        System.out.println(count);
    }
    
}
    

