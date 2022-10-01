class InsertionSort {

    public static void main(String args[]) {
        int arr[] = { 12,34,90,56,83,76,35 };
		InsertionSort ob = new InsertionSort();
		ob.sort(arr);
        System.out.println("Sorted array: ");
		printArray(arr);
	}


    void sort(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i) {
			System.out.print(arr[i] + " ");
        }
	}
}