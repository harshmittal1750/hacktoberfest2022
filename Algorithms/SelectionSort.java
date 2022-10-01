class SelectionSort {
    
	public static void main(String args[])
	{
		SelectionSort ob = new SelectionSort();
        int arr[] = { 12,34,90,56,83,76,35 };
		ob.sort(arr);
		System.out.println("Sorted array: ");
		ob.printArray(arr);
	}

	void sort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n-1; i++) {
			int min_idx = i;
			for (int j = i+1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

	void printArray(int arr[]) {
		int n = arr.length;
		for (int i=0; i<n; ++i) {
			System.out.print(arr[i]+" ");
        }
	}
}
