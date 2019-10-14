import java.util.Scanner;

public class reverseInteger{

	public static int reverse(int num){

		int pop = 0;
		int reverse = 0;
		int maxInt = 511; //assume max is 2^9 - 1 min is -2^9
		int minInt = -512;

		while(num != 0){

			pop = num % 10;
			num /= 10;

			if(reverse > maxInt/10 || (reverse == maxInt/10 && pop > 1)) return 0;
			//reverse > maxInt/10 说明前一位乘10就已经大于最大值了 eg. 52*10 > 512
			if(reverse < minInt/10 || (reverse == minInt/10 && pop < -2)) return 0;

			reverse = reverse*10 + pop;

		}

		return reverse;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println(reverse(num));
	}

}