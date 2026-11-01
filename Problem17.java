// problem17: count numbers between 1 and N that are even and divisible by 3 .

public class Problem17 {
    public static void main(String[] args){
        int N = 100;
        int count = 0;

        for(int i=1; i<=N; i++){
            if(i%2==0 && i%3==0){
                count++;
                
            }
        }
        System.out.println(count);
    }
    
}
