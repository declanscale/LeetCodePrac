import java.lang.*;
import java.util.*;

public class twoSum{

	public static int[] twoSum(int[] nums, int target){
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length; i++){
			map.put(nums[i],i);
		}

		for(int i = 0; i < nums.length; i++){
			int complement = target - nums[i];
			if(map.containsKey(complement) && map.get(complement) != i){
				return new int[] {i, map.get(complement)};
			}
		}

		throw new IllegalArgumentException("No two sum solution");
	}

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		System.out.println(twoSum(nums, 9));
	}
}