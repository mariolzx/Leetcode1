public class Solution {
    private int[] count;
    private boolean[] find;
    public int climbStairs(int n) {
        
    	count = new int[n];
    	find = new boolean[n];
    	count[0] = 1;
    	if(n>1)count[1] = 2;

        return helper(n);
        
    }
    private int helper(int n){
        if (n==1) {
            return count[0];
        }
        if (n==2) {

            return count[1];
        }
        if(!find[n-2]){
             count[n-2] = helper(n-1);
             find[n-2] = true;
        }
        if(!find[n-3]){
             count[n-3] = helper(n-2);
             find[n-3] = true;
        }
        return count[n-2]+count[n-3];
    }
}