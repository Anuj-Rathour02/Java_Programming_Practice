// Problem26: find the first digit of a number .

public class Problem26 {
    public static void main(String[]args){
        int n = 123456789 ;
        while(n>=10){
            n = n/10 ;
        }
        System.out.println(n);
    
    }
    
}
