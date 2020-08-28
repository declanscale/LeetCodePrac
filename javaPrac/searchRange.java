import java.util.*;

class searchRange{
	public static int[] searchRange(int[] nums, int target) {
        if(nums.length == 0) return new int[] {-1,-1};
        if(nums.length == 1) return new int[] {0,0};
        
        int left = 0;
        int right = nums.length - 1;
        
        while(left < right){
            int mid = left + (right - left) / 2;
            
            if(nums[mid] > target) right = mid - 1;
            else if(nums[mid] < target) left = mid;
            else{
            	
                left = mid;
                right = mid;
                /*
                while(left > 0 && right < nums.length){
                    if(nums[left - 1] == target) left--;
                    if(nums[right + 1] == target) right++;
                    return new int[] {left,right};
                }
                */

                while(nums[left] == target || nums[right] == target){
                	System.out.println("rigth:" + right);
                	System.out.println("left: " + left);
                    if(left - 1 >= 0 && nums[left - 1] == target) left--;
                    else if(right + 1 <= nums.length-1 && nums[right + 1] == target){
                    	System.out.println("here");
                    	right++;

                    }
                    else{
                    	System.out.println("enter else");
                    	System.out.println("rigth:" + right);
                		System.out.println("left: " + left);
                    	
                    	return new int[] {left,right};
                    } 
                }
                
                
            }
        }
        
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
    	int[] nums = {1,4};
    	int[] res = new int[2];
    	res = searchRange(nums,4);
    	System.out.println(res);
    }
}