import java.util.*;

class findMaxConsecutiveOnes{

	public static int findMaxConsecutiveOnes(int[] nums) {
        
        int len = 0;
        int max = 0;

        for(int j = 0; j < nums.length; j++){

        	if(nums[j] == 1){

        		len++;

        	}else{
        		if(len >= max){
        			max = len;
        		}
        		len = 0;
        	}
        }

        if(len >= max){
        	max = len;
        }

        return max;
       

    }

    public static void main(String[] args){
    	int[] nums = {1,0,1,1,0,1,0};
    	int max = findMaxConsecutiveOnes(nums);
    	System.out.println(max);
    }

}