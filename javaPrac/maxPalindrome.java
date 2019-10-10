import java.lang.*;
import java.util.Scanner;

//给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
// 中心扩展法 

public class maxPalindrome{

	public static String longestPalidorme(String s){

		int start = 0;
		int end = 0;

		for(int i = 0; i < s.length(); i++){

			int len1 = expandFromCenter(s,i,i); //一个字符是中心
			int len2 = expandFromCenter(s,i,i+1);//两个字符是中心

			int len = Math.max(len1,len2);

			if(len > end - start + 1){ //end - start + 1是目前已知最大回文串长度
				start = i - (len - 1) / 2; // i 是中心 用start和end标记最长回文在字符串中的位置
				end = i + len / 2;
			}

		}

		return s.substring(start, end + 1);
	}

	public static int expandFromCenter(String s, int left, int right){

		int L = left;
		int R = right;

		while(L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)){
			L --;
			R ++;
		}

		return R - L - 1;
	}

	public static void main(String[] args){

		maxPalindrome maxPalindrome = new maxPalindrome();

		Scanner scanner  = new Scanner(System.in);
		String s = scanner.next();
		System.out.println(longestPalidorme(s));
	}
}