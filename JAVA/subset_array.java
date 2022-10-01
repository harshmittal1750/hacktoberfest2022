public class subset_array{

    public static void main(String args[]){
        int arr[]={3,4};
        int n=arr.length;
        int sum=0;
        for(int i=0;i<(1<<n);i++){
            int temp=0;
            for(int j=0;j<n;j++){
              
                
                if((i&(1<<j))!=0){
                    
                    if(j == 0){
                        temp = arr[j];
                    }
                    else{
                        temp = arr[j-1] ;
                    }
                
                    temp=temp&arr[j];
                    
                    System.out.print(arr[j]+" ");


                }
            }
            sum+=temp;
            System.out.println();
        }
        System.out.println(sum);
    }
}
