//Leetcode problem(27)-Remove Elements

public class removeElements {
    public static int removeelement(int nums[], int val) {
        int j = 0; // It removes the elements and also count the remaining elements
        for (int i = 0; i < nums.length; i++) {
            // Check if element is not equal to value
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 2, 3, 4 };
        int val = 2; // Input the element which you want to remove
        System.out.println("Elements present in array:" + removeelement(nums, val));
    }
}
