import java.util.*;

class rotate{

	public static void rotate(int nums[], int k){
		int move = k % nums.length;

		//int j = nums.length - 1;

		int[] newNums = new int[nums.length];

		for(int i = 0; i < nums.length - move; i++){
			newNums[i + move] = nums[i];
		}

		int i = move - 1;
		for(int j = nums.length - 1; j > nums.length - move - 1; j--){
			newNums[i] = nums[j];
			i--;
		}

		for(int y = 0; y < nums.length; y++){
			nums[y] = newNums[y];
		}
	}

	public static void main(String[] args) {

		int[] nums = {1,2,3,4,5,6};

		rotate(nums,3);
		
		System.out.println(Arrays.toString(nums));
	}
}