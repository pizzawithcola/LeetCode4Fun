public class Q4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int index1 = 0;
        int index2 = 0;
        int len_sum = nums1.length + nums2.length;
        int tmp_last = 0;
        int tmp_curr = 0;

        if(len_sum == 0){
            return 0;
        }if(len_sum == 1 && nums1.length == 0){
            return nums2[index2];
        }if(len_sum == 1 && nums2.length == 0){
            return nums1[index1];
        }

        for (int i = 0; i < (len_sum / 2) + 1; i++) {
            tmp_last = tmp_curr;
            if(index1 < nums1.length && index2 < nums2.length){
                tmp_curr = Math.min(nums1[index1], nums2[index2]);
                if(nums1[index1] < nums2[index2]){
                    index1 ++;
                }else{
                    index2 ++;
                }
            }else if(index1 == nums1.length){
                tmp_curr = nums2[index2];
                index2++;
            }else{
                tmp_curr = nums1[index1];
                index1++;
            }
        }

        if(len_sum % 2 == 1){
            return tmp_curr;
        }else{
            return ((double) tmp_curr + (double) tmp_last) / 2;
        }
    }

    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};
        double res = findMedianSortedArrays(a, b);
        System.out.println(res);
    }
}
