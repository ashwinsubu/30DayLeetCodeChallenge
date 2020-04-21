class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int sum=0, maxSum=0;
        for(int i=0;i<nums.length;i++){
            if(sum + nums[i] < 0){
                sum=0;
            } else {
                sum+=nums[i];
                maxSum = maxSum<sum? sum: maxSum;
               
            }
        }
        if(maxSum == 0){
            int max=nums[0];
            for(int i=1;i<nums.length;i++){
                if(max < nums[i]){
                    max = nums[i];
                }
            }
        return max;
        }
        return maxSum;
    }
}