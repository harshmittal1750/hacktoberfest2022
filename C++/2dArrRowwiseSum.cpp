#include <bits/stdc++.h>
using namespace std;
// int rowWiseSum(int arr[][3], int i, int j)
// {
//     for (int i = 0; i < 2; i++)
//     {
//         int sum = 0;
//         for (int j = 0; j < 3; j++)
//         {
//             sum += arr[i][j];
//         }
//         cout << "Sum of row " << i << " is " << sum << endl;
//     }
// }

int largestROwSum(int arr[][3], int i, int j)
{
    int maxi = INT_MIN;
    int rowIndex = -1;
    for (int i = 0; i < 2; i++)
    {
        int sum = 0;
        for (int j = 0; j < 3; j++)
        {
            sum += arr[i][j];
        }
        if (sum > maxi)
        {
            maxi = sum;
            rowIndex = i;
        }
    }
    cout << "MAx Sum is : " << maxi << endl;
    return i;
}
int main()
{
    int arr[2][3];
    // input
    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            cin >> arr[i][j];
        }
    }
    // output
    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            cout << arr[i][j] << " ";
        }
        cout << endl;
    }
    // cout << rowWiseSum(arr, 2, 3) << endl;
    cout << "Max row at Index : " << largestROwSum(arr, 2, 3) << endl;
    return 0;
}