/*
给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。

你可以假设数组是非空的，并且给定的数组总是存在众数。

*/


import java.util.*;

public class findMode{

	public static int majorityElement(int[] nums) {
        
        //int len = nums.length;
        
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer i : nums){
            Integer count = map.get(i);
            count = count == null?1:++count;
            
           /*
           if(count == null){
                count = 1;
            }else{
                count++;
            }
            */
            map.put(i,count);
        }
        
        for(Integer i : map.keySet()){
            if(map.get(i) > (nums.length)/2){
                return i;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
    	int[] nums = {3,2,3};
    	System.out.println(majorityElement(nums));
    }
}