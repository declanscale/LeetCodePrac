import java.util.*;

class reverseWordString{

	public static String reverseWords(String s){
		Stack<String> stack = new Stack<>();

		StringBuilder temp = new StringBuilder();

		s += " ";

		for(int i = 0; i < s.length(); i++){

			if(s.charAt(i) != ' '){
				temp.append(s.charAt(i));
			} else{
				
				if(temp.length() != 0){
					stack.push(temp.toString());
					temp = new StringBuilder();
				}
			}
		}
		if(stack.isEmpty()){
			return "";
		}

		StringBuilder res = new StringBuilder();
		res.append(stack.pop());
		while(!stack.isEmpty()){
			res.append(" ");
			res.append(stack.pop());
		}

		return res.toString();
	}

	public static void main(String[] args) {
		String str = "Hello world I am here";
		System.out.println(reverseWords(str));
	}
}