class CycleSort {  
    
    public static void main(String args[]) {  
        int arr[] = { 12,34,90,56,83,76,35 };
        int n = arr.length;    
        System.out.println("Sorted array: ");
        cycleSort(arr, n);    
        print(arr, n);  
    }

    static void cycleSort(int a[], int n) {    
        int start, element, pos, temp, i;    

        for (start = 0; start <= n - 2; start++) {    
        element = a[start];  
        pos = start;    
          
        for (i = start + 1; i < n; i++)    
            if (a[i] < element)    
                pos++;    
        if (pos == start)
            continue;    
        while (element == a[pos])    
            pos += 1;    
        if (pos != start) {    
            temp = element;    
            element = a[pos];    
            a[pos] = temp;      
        }    
        while (pos != start) {    
            pos = start;    
            for (i = start + 1; i < n; i++)    
                if (a[i] < element)    
                    pos += 1;    
            while (element == a[pos])    
                pos += 1;    
            if (element != a[pos]) {    
                temp = element;    
                element = a[pos];    
                a[pos] = temp;      
            }    
        }    
    }    
 }    

    static void print(int a[], int n) {  
        int i;  
        for(i = 0; i < n; i++) {    
            System.out.print(a[i] + " ");    
        }        
    }  
  
}  