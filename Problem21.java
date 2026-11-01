// problem21: find the largest digit in a number.

public class Problem21 {
    public static void main(String[]args){
        int  n = 8534963;
        int largest = 0;
        while(n !=0){
           int digit = n%10;
            if(digit>largest){
                largest = digit;
            }
            n = n/10;
        }
        System.out.println(largest);
    }
    
}
