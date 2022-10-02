#include <stdio.h>
#include <stdlib.h>

int findMax(int A[] , int n)
{
    int max = INT_MIN;
    for(int i=0 ; i<n ;i++)
    {
        if(A[i] > max)
           max = A[i];
    }
    return max;
}

void CountSort(int A[],int n )
{
    int max,*C;
    max = findMax(A,n);
    C = (int *)malloc(sizeof(int)*(max+1));

    for(int i=0;i<n;i++)
        C[i] = 0;
    
    for(int i=0;i<n;i++)
    {
        C[A[i]]++;
    }

    int i=0,j=0;
    while(j<max+1)
    {
        if(C[j] > 0)
        {
            A[i++] = j;
            C[j]--;
        }
        else
            j++;
    }
}

int main()
{
    printf("Enter no. of elements : ");
    int n;
    scanf("%d",&n);
    printf("Enter Array : ");
    int A[n];
    for(int i=0;i<n;i++)
        scanf("%d",&A[i]);

    // int A[] = {5,8,1,12,9,4};
    // int n = 6;
    
    CountSort(A,n);
    for(int i=0; i<n ;i++)
       printf("%d ",A[i]);

}