public class Q704 {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while(low < high){
            // plus one here is to save the situation when low = 1, high = 2
            mid = low + (high - low + 1) / 2;
            if(nums[mid] > target){
                high = mid - 1;
            }else{
                low = mid;
            }
        }
        return nums[low] == target ? low : -1;
    }
}
