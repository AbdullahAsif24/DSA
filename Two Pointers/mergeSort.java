public class mergeSort {
    public static void main(String[] args) {
        
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int total = m; // track how many elements are valid in nums1

        for (int i = 0; i < n; i++) {
            int insertIndex = 0;
            // Find the correct position to insert nums2[i]
            while (insertIndex < total && nums1[insertIndex] <= nums2[i]) {
                insertIndex++;
            }

            // Shift elements to the right
            for (int j = m + i; j > insertIndex; j--) {
                nums1[j] = nums1[j - 1];
            }

            // Insert the element
            nums1[insertIndex] = nums2[i];
            total++;
        }
    }
}
