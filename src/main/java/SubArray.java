public class SubArray {
    /**
     * Return only a part of an array. For instance, given the array {1,2,3,4,5}, a sub-array with start 1 and end 4
     * would result in {2,3,4}, because the starting index is inclusive, but the ending index is exclusive.
     *
     * @param nums an array of ints.
     * @param start the starting index, inclusive.
     * @param end the ending index, exclusive.
     * @return a sub-array of nums containing the values between start and end.
     */
    public int[] sub(int[] nums, int start, int end) {
        // Validate the indices
        if (nums == null || start < 0 || end > nums.length || start > end) {
            throw new IllegalArgumentException("Invalid start or end index");
        }

        // Create a new array with the correct size
        int[] newArray = new int[end - start];

        // Populate the new array with values from nums
        for (int i = start; i < end; i++) {
            newArray[i - start] = nums[i];
        }

        return newArray;
    }
}