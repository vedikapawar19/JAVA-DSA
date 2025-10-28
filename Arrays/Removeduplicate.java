//Leetcode Problem(26)-Remove Duplicates from sorted array.
public class Removeduplicate {
    public static int FindUniqueNum(int nums[]) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0; // Tracks unique number
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j]; // Unique number will be place at starting in sorted order in the same array
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 2, 2, 3, 4, 5 };
        System.out.println("Number of Unique Elements in Array:" + FindUniqueNum(nums));
    }
}
