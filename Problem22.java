// problem22: find the smallest digit in a number .

public class Problem22 {
    
    public static void main(String[]args){
        int  n = 8534963;
        int smallest = 9;
        while(n !=0){
           int digit = n%10;
            if(digit<smallest){
                smallest = digit;
            }
            n = n/10;
        }
        System.out.println(smallest);
    }
    
}

    

