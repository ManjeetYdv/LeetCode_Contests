class Solution {
    public long sumDigitDifferences(int[] nums) {
        int digit= (int)Math.log10(nums[0]) +1;

        long[] digits = new long[10];
        long ans=0;
        for(int i=0;i<digit ;i++){
            int divisor = (int)Math.pow(10 ,i);
            for(int num:nums){
                int quo = num/divisor;
                digits[quo%10]++;
            }
            for(int d1=0;d1<10;d1++){
                for(int d2=d1+1;d2<10;d2++){
                    ans+= digits[d1]*digits[d2];
                }
                //ans += (digits[d1]*(nums.length-digits[d1])); //return ans/2
                digits[d1]=0;
            }
            
        }
        return ans;
    }
}
