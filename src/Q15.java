import java.sql.Array;
import java.util.*;

public class Q15 {
    public List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        HashSet<List<Integer>> result = new HashSet<>();
        LinkedList<Integer> pos = new LinkedList<Integer>();
        LinkedList<Integer> neg = new LinkedList<Integer>();
        LinkedList<Integer> zero = new LinkedList<Integer>();

        // get them into categories
        for (int num : nums) {
            if (num > 0) pos.add(num);
            else if (num < 0) neg.add(num);
            else zero.add(num);
        }

        // -1 -2 3
        for (int i = 0; i < neg.size(); i++) {
            for(int j = i + 1; j < neg.size(); j++) {
                if(pos.contains(-(neg.get(i) + neg.get(j))))
                    result.add(Arrays.asList(neg.get(i), neg.get(j), -(neg.get(i) + neg.get(j))));
            }

            if(zero.size() != 0){
                for(int j = 0; j < pos.size(); j++) {
                    if(neg.get(i).equals(-pos.get(j))) result.add(Arrays.asList(neg.get(i), 0, pos.get(j)));
                }
            }

            for(int j = i + 1; j < pos.size(); j++) {
                if(neg.contains(-(pos.get(i) + pos.get(j))))
                    result.add(Arrays.asList(-(pos.get(i) + pos.get(j)), pos.get(i), pos.get(j)));
            }
        }

//        //-1 0 1
//        if(zero.size() != 0){
//            for (Integer po : pos) {
//                for (Integer ne : neg) {
//                    if (po == -ne) result.add(Arrays.asList(ne, 0, po));
//                }
//            }
//        }
//
//        // -3 1 2
//        for (int i = 0; i < pos.size(); i++) {
//            for(int j = i + 1; j < pos.size(); j++) {
//                if(neg.contains(-(pos.get(i) + pos.get(j))))
//                    result.add(Arrays.asList(-(pos.get(i) + pos.get(j)), pos.get(i), pos.get(j)));
//            }
//        }

        // 0 0 0
        System.out.println(zero.size());
        if(zero.size() > 2) result.add(Arrays.asList(0, 0, 0));

//        ArrayList<Integer> removeArray = new ArrayList<Integer>();
//        for(int i = 0; i < result.size() - 1; i++) {
//            List<Integer> a = result.get(i);
//            List<Integer> b = result.get(i + 1);
//            int count = 0;
//            for(int j = 0; j < 3; j++) {
//                if(a.get(j).equals(b.get(j))) {
//                    count++;
//                }
//            }
//            if(count == 3){
//                removeArray.add(i);
//            }
//        }
//
//        for(int index : removeArray){
//            result.remove(index);
//        }
        List<List<Integer>> resultList = new ArrayList<>(result);
        return resultList;
    }

    public static void main(String[] args) {
        int[] a = {0, 0, 0};
        HashSet<Integer> b = new HashSet<Integer>();
        b.add(1);
        b.add(2);
        Object[] c = b.toArray();

        System.out.println(c[0]);
    }
}
