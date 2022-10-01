import java.util.*;
import java.util.Collections;

class BucketSort {

    public static void main(String args[]) {
		float arr[] = { (float)0.112, (float)0.176,
						(float)0.134, (float)0.183,
						(float)0.190, (float)0.156,
                        (float)0.135 };

		int n = arr.length;
		bucketSort(arr, n);
        System.out.println("Sorted array: ");
		for (float el : arr) {
			System.out.print(el + " ");
		}
	}


	static void bucketSort(float arr[], int n)
	{
		if (n <= 0)
			return;

		@SuppressWarnings("unchecked")
		Vector<Float>[] buckets = new Vector[n];

		for (int i = 0; i < n; i++) {
			buckets[i] = new Vector<Float>();
		}

		for (int i = 0; i < n; i++) {
			float idx = arr[i] * n;
			buckets[(int)idx].add(arr[i]);
		}

		for (int i = 0; i < n; i++) {
			Collections.sort(buckets[i]);
		}

		int index = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < buckets[i].size(); j++) {
				arr[index++] = buckets[i].get(j);
			}
		}
	}
}