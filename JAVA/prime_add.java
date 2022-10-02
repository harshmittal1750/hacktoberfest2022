import java.util.*;
public class prime_add {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                count++;
                arr[count] = i;
            }
        }
        int sum = 0;
        int c=0;
        for(int i=1;i<=count;i++){
            sum = sum + arr[i];
            if(isPrime(sum)&& sum<=n && sum>2){
                c++;
                // System.out.println(sum);
            }
        }
        System.out.println(c);


        sc.close();
        
    }
    static boolean isPrime(int n) 
    { 
        if (n <= 1) 
            return false; 
        if (n <= 3) 
            return true; 
        if (n % 2 == 0 || n % 3 == 0) 
            return false; 
      
        for (int i = 5; i * i <= n; i = i + 6) 
            if (n % i == 0 || n % (i + 2) == 0) 
                return false;
      
        return true; 
    }
}
