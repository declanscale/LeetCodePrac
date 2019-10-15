public class maxSubArray{

	public int maxSubArray(int[] nums){

		int sum = 0;
		int ans = nums[0];

		for(int num : nums){

			if(sum > 0){
				sum += num;
			}else{
				sum = num;
			}

			ans = Math.max(sum,ans);
		}

		return ans;

	}

	public static void main(String[] args) {

		maxSubArray maxSubArray = new maxSubArray();

		int[] nums = {-2,3,-1,1,-3};

		System.out.println(maxSubArray.maxSubArray(nums));
	}
}