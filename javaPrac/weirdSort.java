import java.util.Scanner;
import java.util.*;

public class weirdSort{

	public static String charSort(String input){
		char inputArray[] = input.toCharArray();
		ArrayList<Character> allChar = new ArrayList<>();
		for(int i = 0; i < inputArray.length; i++){
			if(inputArray[i]>= 'a' && inputArray[i]<='z' || inputArray[i]>='A'&&inputArray[i]<='Z'){
				allChar.add(inputArray[i]);
			}
		}

		Collections.sort(allChar);

		//ArrayList<Character> output = new ArrayList<>();
		int j = 0;
		for(int i = 0; i < inputArray.length; i++){
			if(inputArray[i]>= 'a' && inputArray[i]<='z' || inputArray[i]>='A'&&inputArray[i]<='Z'){
				//inputArray[i] = allChar[j];
				j++;
			}
		} 

		return allChar.toString();
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		System.out.println(charSort(input));
	}
}