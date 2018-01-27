
public class Solution {
	public void sortColors(int[] nums) {
		int n = nums.length;
        int red = 0;
        int blue = n - 1;
        
        for(int i = 0; i <= blue; i++){
        	if(nums[i] == 0)
        		swap(nums, i, red++);
        	if(nums[i] == 2)
        		swap(nums, i--, blue--);
        }
    }
	
	public static void swap(int[] nums, int a, int b){
		int tmp = nums[a];
		nums[a] = nums[b];
		nums[b] = tmp;
	
    }
}
