
import java.util.Scanner;
import java.util.Stack;
import java.lang.*;

public class 括号{

	public boolean match(String[] str){
		Stack<Character> myStack = new Stack<>();

		char[] ch = str.toCharArray();

		for(int i = 0; i < ch.length; i++){

			if(!myStack.empty()){

				Character ch1 = myStack.peek();
				Character ch2 = ch[i];

				if(ch2.equals('(') || ch2.equals('[') || ch2.equals('{')){
					myStack.push(ch2);
				}else if(ch2.equals(')') || ch2.equals(']') || ch2.equals('}')){

					if( ch2.equals(')') && myStack.peek().equals('(') ||
						ch2.equals('}') && myStack.peek().equals('{') ||
						ch2.equals(']') && myStack.peek().equals('[')){

						myStack.pop();
					}
				}
			}else{

				Character ch2 = ch[i];

				if(ch2.equals('(') || ch2.equals('[') || ch2.equals('{')){
					myStack.push(ch[i]);	
				}
				
			}

			
		}

		if(myStack.empty()){
			return true;
		}else{
			return false;
		}
	}

	public static void main(String[] args){
		括号 para = new 括号();
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		System.out.println(para.match(s));
	}

}