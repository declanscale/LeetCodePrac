class longestCommonPrefix{

	public static void main(String[] args) {
		String[] my_strs = {"declan", "dec", "decl"};
		String res = longestCommonPrefix(my_strs);
		System.out.println(res);
	}

	public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        
        for(int i = 0; i < strs[0].length(); i++){

            char c = strs[0].charAt(i);

            for(int j = 1; j <  strs.length; j++){
                if(strs[j].length() == i || strs[j].charAt(i) != c ){
                	//这个条件判断 ||两边的顺序会影响运行的结果， 会先判断左边的 再判断右边的
                    return strs[0].substring(0,i);
                }
            }
        }

        return strs[0];
    }
	
}

