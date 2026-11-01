// problem6: find the sum of even numbers from 1 to N .

public class Problem6 {
    public static void main(String[] args){
        int n = 100;
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(i%2==0)
            sum=sum+i;
        }
        
            System.out.println(sum);

    }
    
}
