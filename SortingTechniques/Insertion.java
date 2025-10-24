public class Insertion {
    public static void Insertionsort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // Compare previous element with current element
            while (prev >= 0 && arr[prev] > curr) {
                // Finding correct Position for current element to insert.
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // Insertion of Current Element
            arr[prev + 1] = curr;
        }

    }

    public static void printarr(int arr[]) {
        System.out.println("Sorted Array using Insertion Sort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        Insertionsort(arr);
        printarr(arr);
    }
}
