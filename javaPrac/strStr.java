public class strStr{

	public static int strStr(String haystack, String needle){

		int haystack_len = haystack.length();
        int needle_len = needle.length();

        if(needle.equals("")) return 0;

        for(int start = 0; start < haystack_len - needle_len + 1; ++start){
            if(haystack.substring(start, start + needle_len).equals(needle)){
                return start;
            }
        }

        return -1;
    
	}

	public static void main(String[] args) {
		
		String myHaystack = "hello";
		String myNeedle = "ll";

		int res = strStr(myHaystack, myNeedle);

		System.out.println(res);
	}
}