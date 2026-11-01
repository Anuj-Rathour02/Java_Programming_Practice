// problem19: find the sum of digits.

public class Problem19 {
    public static void main(String[]args){
        int n = 54896212;
        int sum =  0;
    
        while(n !=0){
            int digit = n%10;
            sum = sum+digit;
            n = n/10;
            
        }
        System.out.println(sum);
    }
    
}
