class Solution {
    public boolean binarySearch(List<Integer> notSpecial , int s , int e){
        int low=0;
        int high=notSpecial.size()-1;
        
        while(low<=high){
            int mid = (low+high)/2;
            int idx = notSpecial.get(mid);
            if(s<=idx && idx<e) return false;
            else if(idx<s) low=mid+1;
            else high=mid-1;
        }
        return true;
    }
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        List<Integer> notSpecial = new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            int xor = nums[i]^nums[i+1];
            if(xor%2==0) notSpecial.add(i);
        }
        
        boolean[]res = new boolean[queries.length];
        int idx=0;
        for(int []query : queries){
            int s=query[0];
            int e=query[1];
            if(s==e) res[idx++]=true;
            else res[idx++]=  binarySearch(notSpecial , s, e);
        }
        return res;
    }
}
