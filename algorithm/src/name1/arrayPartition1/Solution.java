package name1.arrayPartition1;

public class Solution {
	public int arrayPairSum(int[] nums) {
        int sum = 0;
        
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        
        for(int i = 0; i < nums.length; i += 2){
            sum += nums[i];
        }
        
        return sum;
    }
}
