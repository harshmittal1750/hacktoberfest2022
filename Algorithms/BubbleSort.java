public class BubbleSort {
 
    public static void main(String args[])
    {
        int arr[] = { 12,34,90,56,83,76,35 };
        int n = arr.length;
        bubbleSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }   

    static void bubbleSort(int arr[], int n)
     {
         int i, j, temp;
         boolean swapped;
         for (i = 0; i < n - 1; i++)
         {
             swapped = false;
             for (j = 0; j < n - i - 1; j++)
             {
                 if (arr[j] > arr[j + 1])
                 {
                     temp = arr[j];
                     arr[j] = arr[j + 1];
                     arr[j + 1] = temp;
                     swapped = true;
                 }
             }
 
             if (swapped == false)
                 break;
         }
     }
 
     static void printArray(int arr[], int size)
     {
         int i;
         for (i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
         }
     }
}