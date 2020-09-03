/*
给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。

不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。

元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。



作者：力扣 (LeetCode)
链接：https://leetcode-cn.com/leetbook/read/array-and-string/cwuyj/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

*/
class removeElement{
	public static void main(String[] args) {
		int[] myNums = {0,1,2,2,0,3,4,2};
		int[] res = {};
		int index = removeElement(myNums, 2);
		for(int i = 0; i < index; i++){
			System.out.println(myNums[i]);
		}
	}

	public static int removeElement(int[] nums, int val){
		int slow_pointer = 0;

        for(int fast_pointer = 0; fast_pointer < nums.length; fast_pointer++){
            if(nums[fast_pointer] != val){
                nums[slow_pointer] = nums[fast_pointer];
                slow_pointer++;
            }
        }

        return slow_pointer;
	}
}