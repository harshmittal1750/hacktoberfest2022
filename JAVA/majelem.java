import java.util.*; 
class majelem
{
static int majorityNumber(int arr[], int n)
{
    int ans = -1;
    HashMap<Integer,
            Integer> freq = new HashMap<Integer,
                                        Integer>();
                                         
    for (int i = 0; i < n; i++)
    {
        if(freq.containsKey(arr[i]))
        {
            freq.put(arr[i], freq.get(arr[i]) + 1);
        }
        else
        {
            freq.put(arr[i], 1);
        }
        if (freq.get(arr[i]) > n / 2)
            ans = arr[i];
    }
    return ans;
}
public static void main(String[] args)
{
    int a[] = {2, 2, 1, 1, 1, 2, 2};
    int n = a.length;
    System.out.println(majorityNumber(a, n));
}
}