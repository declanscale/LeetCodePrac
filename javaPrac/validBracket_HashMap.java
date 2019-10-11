import java.lang.*;
import java.util.*;

public class validBracket_HashMap{

	private HashMap<Character,Character> mapping;

	public validBracket_HashMap(){

		this.mapping = new HashMap<Character,Character>();
		this.mapping.put(')','(');
		this.mapping.put('}','{');
		this.mapping.put(']','[');

	}

	public boolean isValid(String s){

		Stack<Character> stack = new Stack<Character>();

		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);

			if(this.mapping.containsKey(c)){
				char topElement = stack.empty() ? '#' : stack.pop();

				if(topElement != this.mapping.get(c)){
					return false;
				} 

			} else {
				stack.push(c);
			} 
		}

		return stack.isEmpty();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		validBracket_HashMap validBracket_HashMap = new validBracket_HashMap();
		System.out.println(validBracket_HashMap.isValid(s));
	}
}