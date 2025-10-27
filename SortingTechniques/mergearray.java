//Leetcode Problem(88)-Merge sorted Array in Increasing order(Easy)
public class mergearray {
    public static void merge(int nums1[], int m, int nums2[], int n) {
        int[] merged = new int[m + n];// Creating array of size m+n
        int i = 0, j = 0, k = 0;

        // Store small number first in merged array
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        // Storing remaining numbers in nums1[]
        while (i < m) {
            merged[k++] = nums1[i++];
        }

        // Storing remaining number in nums2[]
        while (j < n) {
            merged[k++] = nums2[j++];
        }

        // Copy merging array in nums1[] array
        for (int x = 0; x < m + n; x++) {
            nums1[x] = merged[x];
        }
    }

    // Print the array(nums1) which is merge in increasing order
    public static void print(int nums1[], int totallength) {
        for (int x = 0; x < totallength; x++) {
            System.out.print(nums1[x] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nums1[] = new int[7];// create space in nums1 for nums2 element for merge
        nums1[0] = 1;
        nums1[1] = 2;
        nums1[2] = 3;

        int nums2[] = { 2, 4, 5, 6, };

        merge(nums1, 3, nums2, 4);
        print(nums1, 7);
    }
}
