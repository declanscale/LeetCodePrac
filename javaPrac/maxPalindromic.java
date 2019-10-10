import java.lang.*;
import java.util.Scanner;

//给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
//暴力求解

public class maxPalindromic{

	public static boolean isPalindromic(String s){

		int len = s.length();

		if(len == 1) return true;

		for(int i = 0; i < len / 2; i++){

			if(s.charAt(i) != s.charAt(len-i-1)){
				return false;
			}
		}

		return true;
	}

	public static String longestPalindromic(String s){

		String result = "";
		int max = 0;
		int len = s.length();

		if(len == 1) return s; 

		for(int i = 0; i < len; i++){

			for(int j = i + 1; j <= len; j++){

				String curString = s.substring(i,j);

				if(isPalindromic(curString) && curString.length() > max){
					max = curString.length();
					result = curString;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		maxPalindromic maxPalindromic = new maxPalindromic();
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		System.out.println(longestPalindromic(s));
	}

}