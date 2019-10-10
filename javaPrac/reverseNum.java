import java.lang.*;
import java.util.Scanner;


public class reverseNum{

	public static int isReverse(String num){

		char numArray[] = num.toCharArray();
		int length = numArray.length;

		for(int i = 0; i < length; i++){

			Character a = num.charAt(i);
			Character b = num.charAt(length-1);//这里如果用char下面比较是就不能deferenced，因为char是primitive基本数据类型
			//!(num.charAt(i) == num.charAt(length-1))
			if(!a.equals(b)){
				return 0;
			}

			length--;
		}
		return 1;
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String num = scanner.next();
		System.out.println(isReverse(num));
	}
}