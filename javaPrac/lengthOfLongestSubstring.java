import java.util.*;
//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
/**输入: "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
**/
class lengthOfLongestSubstring{
	public static int lengthOfLongestSubstring(String s) {

		if(s.length() == 1) return 1;
        if(s.length() == 0) return 0;

        char[] sArray = s.toCharArray();
        
        HashSet<Character> set = new HashSet<>();
        
        int maxLen = 0;
        int len = 0;
        
        for(int i = 0; i < sArray.length; i++){
            
            for(int j = i; j < sArray.length; j++){
                
                if(set.contains(sArray[j])){
                    if(len > maxLen) maxLen = len;
                    set.clear();
                    len = 0;
                    break;
                }else{
                    set.add(sArray[j]);
                    len++;
                }

                System.out.println(set);

            } 
        }
        return maxLen;
    }

    public static void main(String[] args) {
    	String s = "pwwke";
    	int len = lengthOfLongestSubstring(s);

    	System.out.println(len);
    }
}