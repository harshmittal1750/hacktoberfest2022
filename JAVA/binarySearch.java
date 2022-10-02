import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
  static int rec_binary_search(int arr[], int left, int right, int x) {
  int result;
  if (right >= left) {
    int mid = left + (right - left)/2;
    if (arr[mid] == x)  return mid;
    if (arr[mid] > x) return rec_binary_search(arr, left, mid-1, x);
    result = rec_binary_search(arr, mid+1, right, x);
    return result;
  }
  return -1;       // when element is not present in array.
}

  public static void main(String[] args)
  {
    int loc, x, array[]={10,11,12,13,14,25,26,37,48,59};
    x = 11;        // element to be searched in the array
    loc=rec_binary_search(array,0,10,x);
    if(loc != -1)
      System.out.print("Element found at location : " + loc);
    else
      System.out.print("Element not present in the array.");

  }
}
