import java.util.HashMap;
import java.util.Map;

public class Q1 {
//    public static int[] twoSum(int[] nums, int target) {
//        int[] result = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            int res = target - nums[i];
//            for (int j = i + 1; j < nums.length ; j++) {
//                if(nums[j] == res){
//                    result[0] = i;
//                    result[1] = j;
//                }
//            }
//        }
//        return result;
//    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> deductionResult = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(deductionResult.containsKey(target - nums[i])){
                return new int[]{deductionResult.get(target - nums[i]), i};
            }
        deductionResult.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int target = 6;
        int[] nums = new int[4];
        nums[0] = 3;
        nums[1] = 3;
//        nums[2] = 4;
//        nums[3] = 15;
        int[] res = new int[2];
        res = twoSum(nums, target);
        System.out.println(res[0] + " " + res[1]);
    }
}
