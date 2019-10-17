//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。


import java.util.Scanner;

public class palindromicInteger{

	public static boolean isPalindrome(int x){

		int revertedNumber = 0;

		if(x < 0 || (x % 10 == 0 && x != 0)) return false;

		while(x > revertedNumber){

			revertedNumber = revertedNumber*10 + x%10;
			x /= 10;
		}

		return revertedNumber == x || (revertedNumber/10 == x);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println(isPalindrome(number));
	}
}