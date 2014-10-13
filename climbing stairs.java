public class Solution {
    
    private int[] count;
    public int climbStairs(int n) {
        count=new int[n];
        int m=f(n);
        return m;
    }
    
        public int f(int n){
            if (n==1) {
                    count[0]=1;
                    return 1;}
            if (n==2) {
                    count[1]=2;
                    return 2;}
                count[0]=1;
                count[1]=2;
            if (count[n-2]==0) count[n-2]=f(n-1);
            if (count[n-3]==0) count[n-3]=f(n-2);
                count[n-1]=count[n-2]+count[n-3];
            return count[n-1];
        }
}