public class Q724 {
    public int pivotIndex(int[] nums) {
        int[] front = new int[nums.length];
        int[] end = new int[nums.length];
        front[0] = nums[0];
        end[0] = nums[nums.length - 1];
        int back_index = nums.length - 2;
        for(int i = 1; i < nums.length; i++){
            front[i] = nums[i] + front[i - 1];
            end[i] = nums[back_index] + end[i - 1];
            back_index--;
        }
        for(int i = 0; i < nums.length; i++){
            if(front[i] == end[nums.length - i - 1]){

                return i;
            }
        }
        return -1;
    }
}
