package leetcode;

public class easy561 {

	public static void main(String[] args) {
		
		
		int ans = 0;
	    int [] nums= {5,2,6,10,11,4,8,9,90,66};
	    
        //sorting
        int k=0;
        for(int i=0; i<nums.length; i++){
             for(int j=0; j<nums.length; j++){
                if(nums[i] >= nums[j]) {} 
                else {
                    k = nums[j];
                    nums[j] = nums[i];
                    nums[i] = k;
                } 
             }
        }
        
        for(int i =0; i<nums.length; i++)          System.out.print(nums[i]+" ");
        
        for(int i=0; i<nums.length; i++){
            ans += nums[i];
            i++;
        }
        
        System.out.print("\nanswer: ");
        System.out.print(ans);
	}

}
