class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n=nums.length;
        if(n==1) return true;

        for(int i=0;i<n-1;i++){
            int xor=nums[i]^nums[i+1];
            if(xor%2==0) return false;
        }
        return true;
    }
}
