// problemm18: count the number of digits in a number.

public class Problem18 {
    public static void main(String[] args){
       int n = 1478925 ;
       int count =  0;
        while(n != 0){
            n = n/10;
            count++;

        }
        System.out.println(count);
    }
    
    
}
