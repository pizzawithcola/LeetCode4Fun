public class Q70 {
    int count = 0;
    public int climbStairs(int n) {
        if(n == 1) return 1;
        walk(n, 0, 1);
        walk(n, 0, 2);
        return count;
    }

    public void walk(int total, int cur, int step){
        cur += step;
        if(cur == total){
            count++;
            return;
        }else if(cur + 1 == total){
            walk(total, cur, 1);
        }else{
            walk(total, cur, 1);
            walk(total, cur, 2);
        }

    }
}
