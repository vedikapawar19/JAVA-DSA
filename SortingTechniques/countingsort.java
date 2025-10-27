//Counting Sort-It is used when range of numbers is smaller
public class countingsort {
    public static void counting(int arr[]) {
        // Store largest number in array
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            // Compare current number in array with number store in largest
            largest = Math.max(largest, arr[i]);
        }

        // Create new array named count having length (largest number +1)
        int count[] = new int[largest + 1];
        // For storing frequency(taking as element) of elements in this array
        for (int i = 0; i < arr.length; i++) {
            // In count array taking element in original array as index of count array and
            // then increase
            count[arr[i]]++;
        }

        // for sorting in increasing order
        int j = 0;
        // Taking reference of count array
        for (int i = 0; i < count.length; i++) {
            // Run loop when count is greater than 0
            while (count[i] > 0) {
                // Store index of counting array as element in array(j)
                arr[j] = i;
                // Increase index of j by 1
                j++;
                // decrease count by 1
                count[i]--;
            }
        }

    }

    // Printing Sorted Array
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        counting(arr);
        printarr(arr);
    }
}
