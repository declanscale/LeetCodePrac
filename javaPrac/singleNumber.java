//给定一个非空整数数组，除了某个元素只出现一次以外,
//其余每个元素均出现两次。找出那个只出现了一次的元素。

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class singleNumber{

	public static int findSingleNum(int[] nums){

		Map<Integer, Integer> map = new HashMap<>();

		for(Integer i : nums){

			Integer count = map.get(i);
			count = count == null ? 1 : ++count;
			map.put(i,count);
		}

		for(Integer i : map.keySet()){

			Integer count = map.get(i);
			if(count == 1) return i;

		}

		return -1;
	}

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,3,2};
		System.out.println(findSingleNum(nums));
	}

}