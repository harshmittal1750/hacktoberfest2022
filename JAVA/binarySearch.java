public class binarySearch {

    int bs(int a[],int low,int high, int x) //time complexity =O(log n)
	{
		if (high >= low)
		{
			int mid=(low+high)/2;
		
		
		if(x==a[mid])
			return mid;
		
		else if(x<a[mid])
			return bs(a,low,mid-1,x);
		else 
			return bs(a,mid+1,high,x);
		}
		else 
			return -1;
	}

    public static void main(String[] args) {

int arr[]= {1,2,5,7,9};
int n=arr.length;
int x=7; // x is the no. you want to search

binarySearch ob=new binarySearch();
		int res=ob.bs(arr,0,n-1,x);
		
		if(res==-1)
			System.out.println("Not Found");
		else
			System.out.println("Element found at index: "+res);
	}
    
}
