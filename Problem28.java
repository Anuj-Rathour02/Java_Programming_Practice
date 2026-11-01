//Check whether the sum of all digits is even or odd.//

public class Problem28 {
    public static void main(String[]args){

        int n = 54896212;
        int sum =  0;
    
        while(n !=0){
            int digit = n%10;
            sum = sum+digit;
            n = n/10;
        }

        if(sum%2 == 0){
            System.out.println("the sum is even");
        }
        else{
            System.out.println("the sum is odd");
        }

        System.out.println(sum);
    }
    
}

    

