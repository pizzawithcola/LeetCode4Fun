public class Test {
    public static int[] classWork(int n){
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = n * i;
        }
        return ans;
    }

    public static int[] classWork2(int n){
        int[] ans = new int[n + 2];
        ans[0] = (int) Math.pow(2, n);
        for (int i = 1; i < n + 2; i++) {
            if(i % 2 == 0){
                ans[i] = ans[i-1] / 4;
            }else{
                ans[i] = ans[i-1] * 2;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n + 2; i++) {
            System.out.print(classWork2(n)[i] + " ");
        }
    }
}
